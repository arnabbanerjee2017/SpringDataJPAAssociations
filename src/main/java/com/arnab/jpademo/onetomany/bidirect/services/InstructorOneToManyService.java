package com.arnab.jpademo.onetomany.bidirect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnab.jpademo.onetomany.bidirect.domains.Course;
import com.arnab.jpademo.onetomany.bidirect.domains.Instructor;
import com.arnab.jpademo.onetomany.bidirect.repo.InstructorOneToManyRepo;

@Service
public class InstructorOneToManyService {

	@Autowired
	private InstructorOneToManyRepo repo;

	public void create() {
		Instructor instructor = new Instructor();
		instructor.setEmail("ab@c.d");
		instructor.setFirstName("ARNAB");
		instructor.setLastName("BANERJEE");

		Course course1 = new Course();
		course1.setTitle("ABC");
		Course course2 = new Course();
		course2.setTitle("XYZ");

		instructor.addCourse(course1);
		instructor.addCourse(course2);

		repo.save(instructor);
	}

	public Instructor getById(int id) {
		Instructor instructor = repo.findById(id).get();

		for (Course course : instructor.getCourses()) {
			course.setInstructor(null);
		}

		return instructor;
	}

}
