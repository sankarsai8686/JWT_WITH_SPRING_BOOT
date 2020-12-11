package com.sankar.tech.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class JwtSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("===JwtSpringBootApplication===");
		SpringApplication.run(JwtSpringBootApplication.class, args);
	}

}
