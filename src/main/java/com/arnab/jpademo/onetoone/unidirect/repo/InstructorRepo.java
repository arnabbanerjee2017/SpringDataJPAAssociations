package com.arnab.jpademo.onetoone.unidirect.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.arnab.jpademo.onetoone.unidirect.domains.Instructor;

public interface InstructorRepo extends CrudRepository<Instructor, Integer> {
	
	@Query(value = "SELECT id.youtubeChannel FROM Instructor i, InstructorDetail id WHERE i.instructorDetail = id.id and i.id = :id")
	String findByIdButWithYoutubeChannel(int id);

}
