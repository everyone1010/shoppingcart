package com.msn.poc.cart.controller;

import java.util.Set;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("cart")
public interface CartControllerFeignClient {
	@RequestMapping(value = "getall", method = RequestMethod.GET)
	Set<String> getAll();
}
