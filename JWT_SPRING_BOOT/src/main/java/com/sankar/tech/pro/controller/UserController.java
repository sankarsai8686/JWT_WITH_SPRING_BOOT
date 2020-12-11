package com.sankar.tech.pro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/hello")
	public String printMessage()
	{
		return "Welcome !!!";
	}
	

}
