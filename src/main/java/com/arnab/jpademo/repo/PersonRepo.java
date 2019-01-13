package com.arnab.jpademo.repo;

import org.springframework.data.repository.CrudRepository;

import com.arnab.jpademo.domains.Person;

public interface PersonRepo extends CrudRepository<Person, Long> {

}
