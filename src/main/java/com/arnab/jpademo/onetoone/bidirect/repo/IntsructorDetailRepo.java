package com.arnab.jpademo.onetoone.bidirect.repo;

import org.springframework.data.repository.CrudRepository;

import com.arnab.jpademo.onetoone.bidirect.domains.InstructorDetailBidirect;

public interface IntsructorDetailRepo extends CrudRepository<InstructorDetailBidirect, Integer> {

}
