package com.arnab.jpademo.onetomany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.jpademo.onetomany.domains.Customer;
import com.arnab.jpademo.onetomany.services.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping(value = "/create")
	public void create() {
		service.create();
	}
	
	@GetMapping(value = "/get/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return service.getCustomerById(id);
	}
	
}
