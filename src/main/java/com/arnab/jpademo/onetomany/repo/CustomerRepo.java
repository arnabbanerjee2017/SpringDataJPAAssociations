package com.arnab.jpademo.onetomany.repo;

import org.springframework.data.repository.CrudRepository;

import com.arnab.jpademo.onetomany.domains.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
