package com.arnab.jpademo.onetoone.unidirect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnab.jpademo.onetoone.unidirect.domains.Instructor;
import com.arnab.jpademo.onetoone.unidirect.domains.InstructorDetail;
import com.arnab.jpademo.onetoone.unidirect.repo.InstructorRepo;

@Service
public class InstructorService {

	@Autowired
	private InstructorRepo repo;
	
	public void create() {
		InstructorDetail instructorDetail = new InstructorDetail();
		instructorDetail.setHobby("Listening to music");
		instructorDetail.setYoutubeChannel("https://www.youtube.com/arnab");
		
		Instructor instructor = new Instructor();
		instructor.setEmail("arnab.ban09@gmail.com");
		instructor.setFirstName("Arnab");
		instructor.setInstructorDetail(instructorDetail);
		instructor.setLastName("Banerjee");
		
		repo.save(instructor);
	}
	
	public Instructor getById(int id) {
		return repo.findById(id).get();
	}
	
	public String getYoutubeChannelById(int id) {
		return repo.findByIdButWithYoutubeChannel(id);
	}
	
}
