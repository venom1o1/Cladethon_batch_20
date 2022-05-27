package com.zensar.scm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.scm.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
