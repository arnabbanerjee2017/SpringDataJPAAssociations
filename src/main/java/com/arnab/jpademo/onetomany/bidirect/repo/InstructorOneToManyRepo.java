package com.arnab.jpademo.onetomany.bidirect.repo;

import org.springframework.data.repository.CrudRepository;

import com.arnab.jpademo.onetomany.bidirect.domains.Instructor;

public interface InstructorOneToManyRepo extends CrudRepository<Instructor, Integer> {

}
