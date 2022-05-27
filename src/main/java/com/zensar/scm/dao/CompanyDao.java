package com.zensar.scm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.scm.entity.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer>{

}
