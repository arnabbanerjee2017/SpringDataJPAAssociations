package com.arnab.jpademo.onetomany.bidirect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.jpademo.onetomany.bidirect.domains.Instructor;
import com.arnab.jpademo.onetomany.bidirect.services.InstructorOneToManyService;

@RestController
@RequestMapping(value = "/instructor/courses")
public class InstructorOneToManyController {

	@Autowired
	private InstructorOneToManyService service;
	
	@GetMapping(value = "/create")
	public void create() {
		service.create();
	}
	
	@GetMapping(value = "/get/{id}")
	public Instructor getById(@PathVariable int id) {
		return service.getById(id);
	}
	
}
