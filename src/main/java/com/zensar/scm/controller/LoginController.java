/**
 * 
 */
package com.zensar.scm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.scm.dto.UserDto;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/v1")
@Tag(name = "User Authentication- Basic")
public class LoginController {
	
	
	@GetMapping("/{user}")
	public String welcome(@PathVariable("user") String user) {
		return "welcome";
	}
	
	
	@PostMapping
	public String authenticate(@RequestBody UserDto user) {
		return "welcome";
	}

}
