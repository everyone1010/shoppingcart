package com.msn.poc.user.controller;

import java.util.HashSet;
import java.util.Set;

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

import com.msn.poc.user.feignclient.CartFeignClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/")
@Api(tags = { "cartconsumer" })
public class CartConsumerController extends AbstractRestHandler {
	
//	@Autowired
//	CartFeignClient cartFeignClient;
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "getcart", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Consumes the cart service via feign client", notes = "Service to service call without hardcoding or directly refering the ip port of the called service")
	public Set<String> getCart() {
		//return cartFeignClient.getAll();
		ParameterizedTypeReference<Set<String>>  parameterizedTypeReference = new ParameterizedTypeReference<Set<String>>(){};
		ResponseEntity<Set<String>> restExchange = restTemplate.exchange("http://cart/v1/getall",HttpMethod.GET,null,parameterizedTypeReference);
		return restExchange.getBody();
	}
}
