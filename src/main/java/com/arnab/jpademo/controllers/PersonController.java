package com.arnab.jpademo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.jpademo.domains.Person;
import com.arnab.jpademo.services.PersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@GetMapping(value = "/create")
	public void create() {
		service.create();
	}
	
	@GetMapping(value = "/get/{id}")
	public Person getById(@PathVariable Long id) {
		return service.getPersonById(id);
	}
}
