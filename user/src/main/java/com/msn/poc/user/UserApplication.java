package com.msn.poc.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//TODO UNCOMMENT TO ENABLE FEIGN CLIENT
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
// TODO UNCOMMENT TO ENABLE FEIGN CLIENT
// @EnableFeignClients
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableZuulProxy
@ComponentScan(basePackages = "com.msn.poc.user")
public class UserApplication extends SpringBootServletInitializer {

	private static final Class<UserApplication> applicationClass = UserApplication.class;
	private static final Logger log = LoggerFactory.getLogger(applicationClass);
	
	//RIBBON
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	//ZIPKIN CLIENT for 100%
	@Bean 
	public AlwaysSampler defaultSampler() { 
	  return new AlwaysSampler(); 
	}

	public static void main(String[] args) {
		log.debug("#### User Service ####");
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.debug("#### User Service ####");
		return application.sources(applicationClass);
	}
}
