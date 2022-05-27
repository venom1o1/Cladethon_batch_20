package com.zensar.scm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.scm.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
}
