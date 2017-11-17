package com.msn.poc.cart.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feign/")
public class CartController extends AbstractRestHandler {

	@Autowired
	CartControllerFeignClient cartControllerFeignClient;

	@RequestMapping(value = "getall", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Set<String> getAll() {
		return cartControllerFeignClient.getAll();
	}
}
