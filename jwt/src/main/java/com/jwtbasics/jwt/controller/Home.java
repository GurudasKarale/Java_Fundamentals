package com.jwtbasics.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		String text = "this is accessible to authenticated users only";
		return text;
	}

}
