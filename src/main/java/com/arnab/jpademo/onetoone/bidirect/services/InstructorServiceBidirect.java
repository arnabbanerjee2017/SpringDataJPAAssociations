package com.arnab.jpademo.onetoone.bidirect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnab.jpademo.onetoone.bidirect.domains.InstructorBidirect;
import com.arnab.jpademo.onetoone.bidirect.domains.InstructorDetailBidirect;
import com.arnab.jpademo.onetoone.bidirect.repo.IntsructorDetailRepo;
import com.arnab.jpademo.onetoone.unidirect.domains.Instructor;
import com.arnab.jpademo.onetoone.unidirect.domains.InstructorDetail;
import com.arnab.jpademo.onetoone.unidirect.repo.InstructorRepo;

@Service
public class InstructorServiceBidirect {

	@Autowired
	private InstructorRepo repo;
	
	@Autowired
	private IntsructorDetailRepo detailRepo;
	
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
	
	public void createByInstructorDetail() {
		InstructorDetailBidirect arnabDetail = new InstructorDetailBidirect();
		arnabDetail.setHobby("Listening to Podcasts");
		arnabDetail.setYoutubeChannel("https://www.youtube.com/arnab");
		
		InstructorBidirect arnab = new InstructorBidirect();
		arnab.setEmail("arnab.ban15@gmail.com");
		arnab.setFirstName("ARNAB");
		//instructor.setInstructorDetail(instructorDetail);
		arnab.setLastName("BANERJEE");
		
		arnabDetail.setInstructor(arnab);
		
		detailRepo.save(arnabDetail);
		
		InstructorDetail instructorDetail = new InstructorDetail();
		instructorDetail.setHobby("Watching movies");
		instructorDetail.setYoutubeChannel("https://www.youtube.com/arnab");
		
		Instructor instructor = new Instructor();
		instructor.setEmail("arnab.ban2017@gmail.com");
		instructor.setFirstName("Arnab");
		instructor.setInstructorDetail(instructorDetail);
		instructor.setLastName("Banerjee");
		
		repo.save(instructor);
	}
	
	public InstructorDetailBidirect getInstructorDetailById(int id) {
		return detailRepo.findById(id).get();
	}
	
}
