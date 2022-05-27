package com.zensar.scm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.scm.dao.CompanyDao;
import com.zensar.scm.entity.Company;
import com.zensar.scm.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao companyDao;

	@Override
	public List<Company> getCompanyDetails() {
		
		return null;
	}
	
	
}
