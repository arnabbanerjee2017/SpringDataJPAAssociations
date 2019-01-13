package com.arnab.jpademo.onetoone.bidirect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.jpademo.onetoone.bidirect.domains.InstructorDetailBidirect;
import com.arnab.jpademo.onetoone.bidirect.services.InstructorServiceBidirect;
import com.arnab.jpademo.onetoone.unidirect.domains.Instructor;

@RestController
@RequestMapping(value = "/instructor/bidirect")
public class InstructorControllerBidirect {

	@Autowired
	private InstructorServiceBidirect service;
	
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
	
	@GetMapping(value = "/create/instructorDetail")
	public void createInstructorDetail() {
		service.createByInstructorDetail();
	}
	
	@GetMapping(value = "/get/instructorDetail/{id}")
	public InstructorDetailBidirect getInstructorDetailById(@PathVariable int id) {
		return service.getInstructorDetailById(id);
	}
	
}
