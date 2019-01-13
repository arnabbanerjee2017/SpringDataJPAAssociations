package com.arnab.jpademo.onetomany.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arnab.jpademo.onetomany.domains.Customer;
import com.arnab.jpademo.onetomany.domains.PhoneNumber;
import com.arnab.jpademo.onetomany.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	public void create() {
		Customer customer = new Customer();
		customer.setName("Arnab Banerjee");
				
		PhoneNumber ph1 = new PhoneNumber();
		ph1.setNumber("9876543210");
		ph1.setType("HOME");
		
		PhoneNumber ph2 = new PhoneNumber();
		ph2.setNumber("0123456789");
		ph2.setType("MOBILE");
		
		customer.addPhoneNumber(ph1);
		customer.addPhoneNumber(ph2);		
		
		repo.save(customer);
		
	}
	
	@Transactional
	public Customer getCustomerById(int id) {
		Customer cust = repo.findById(id).get();
		
		return cust;
	}
	
}
