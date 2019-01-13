package com.arnab.jpademo.onetoone.unidirect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.jpademo.onetoone.unidirect.domains.Instructor;
import com.arnab.jpademo.onetoone.unidirect.services.InstructorService;

@RestController
@RequestMapping(value = "/instructor")
public class InstructorController {

	@Autowired
	private InstructorService service;
	
	@GetMapping(value = "/create")
	public void create() {
		service.create();
	}
	
	@GetMapping(value = "/get/{id}")
	public Instructor getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@GetMapping(value = "/get/youtube/{id}")
	public String getYoutubeChannelById(@PathVariable int id) {
		return service.getYoutubeChannelById(id);
	}
	
}
