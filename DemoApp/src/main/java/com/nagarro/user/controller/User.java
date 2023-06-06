package com.nagarro.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class User {
	
	@GetMapping("/user")
	public String user() {
		return "It's Working!!!";
	}

}


