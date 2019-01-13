package com.arnab.jpademo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnab.jpademo.domains.Address;
import com.arnab.jpademo.domains.Name;
import com.arnab.jpademo.domains.Person;
import com.arnab.jpademo.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo repo;
	
	public void create() {
		Name name = new Name();
		name.setFirstName("Arnab");
		name.setLastName("Banerjee");
		Address address = new Address();
		address.setAddress("Nager Bazar");
		address.setCity("Kolkata");
		address.setCountry("India");
		address.setState("West Bengal");
		address.setZipcode("700074");
		Person person = new Person();
		person.setName(name);
		person.setAddress(address);
		
		repo.save(person);
	}
	
	public Person getPersonById(Long id) {
		return repo.findById(id).get();
	}
}
