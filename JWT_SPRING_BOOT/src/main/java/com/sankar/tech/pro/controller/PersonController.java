package com.sankar.tech.pro.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sankar.tech.pro.model.Person;

@RestController
public class PersonController {
	
	
	@GetMapping("/persons")
	public List<Person> getUsers()
	{
		List<Person> list = Arrays.asList(
				new Person(1,"sai","Sankarsai8686#","sai@gmail.com"),
				new Person(2,"giri","giri8686#","giri@gmail.com")
				);
		return list;
	}

}
