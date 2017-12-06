package com.msn.poc.user.controller;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
//TODO UNCOMMENT TO ENABLE FEIGN CLIENT
//import com.msn.poc.user.feignclient.CartFeignClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/")
@Api(tags = { "cartconsumer" })
public class CartConsumerController extends AbstractRestHandler {
	private static Logger log = LoggerFactory.getLogger(CartConsumerController.class);
	//TODO UNCOMMENT TO ENABLE FEIGN CLIENT
	// @Autowired
	// CartFeignClient cartFeignClient;
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand( fallbackMethod = "fallbackCart",
			threadPoolKey = "userGetCartThreadPool", 
			threadPoolProperties = {
					@HystrixProperty(name = "coreSize", value = "30"),
					@HystrixProperty(name = "maxQueueSize", value = "10") }, 
			commandProperties = {
					@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2500"),
					@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
					@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "75"),
					@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "7000"),
					@HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "15000"),
					@HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "5") })

	@RequestMapping(value = "getcart", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Consumes the cart service via feign client", notes = "Service to service call without hardcoding or directly refering the ip port of the called service")
	public Set<String> getCart() {
		//TODO UNCOMMENT TO ENABLE FEIGN CLIENT
		// return cartFeignClient.getAll();
		
//		Random rand = new Random();
//		int randomNumber = rand.nextInt((3-1)+1)+1;
//		if(randomNumber == 3) {
//			sleep();
//		}
		
		ParameterizedTypeReference<Set<String>> parameterizedTypeReference = new ParameterizedTypeReference<Set<String>>() {
		};
		ResponseEntity<Set<String>> restExchange = restTemplate.exchange("http://cart/v1/getall", HttpMethod.GET, null,
				parameterizedTypeReference);
		log.info("#### CartConsumerController->getCart");
		return restExchange.getBody();
	}
	
	private Set<String> fallbackCart(){
		Set<String> s = new HashSet<String>();
		s.add("Default");
		return s;
	}
	
	/*
	private void sleep() {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ex) {
			//ex.printStackTrace();
		}
	}
	*/
}
