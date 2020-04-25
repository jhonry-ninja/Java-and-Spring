package com.codingdojo.stringsassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing Dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation 
@RestController
public class StringsassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsassignmentApplication.class, args);
	}
	// 1. Annotation
	@RequestMapping("/")
	
	public String strings() {
		return "Hello client! How are you doing?";
	}
	
	@RequestMapping("/random")
	
	public String random() {
		return "Spring Boot is greate! So easy to just respond with strings";
	}

}
