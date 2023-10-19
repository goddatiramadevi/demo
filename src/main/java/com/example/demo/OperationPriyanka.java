package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationPriyanka {
	
	
	@GetMapping("/home")
	public String home() {
		System.out.println("controller delegated to home page");
		
		return "welcome to hrms";
	}
	
	
	

}
