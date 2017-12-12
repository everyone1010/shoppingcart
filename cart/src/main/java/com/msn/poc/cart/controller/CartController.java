package com.msn.poc.cart.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/")
@Api(tags = { "cart" })
public class CartController extends AbstractRestHandler {

	private static final Class<CartController> clasz = CartController.class;

	@Autowired
	ObjectMapper objectMapper;

	@RequestMapping(value = "getall", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Get all the cartid's", notes = "Get all the cartid's")
	public Set<String> getAll() {
		Set<String> data = new HashSet<String>();
		data.add("786");
		return data;
	}
}
