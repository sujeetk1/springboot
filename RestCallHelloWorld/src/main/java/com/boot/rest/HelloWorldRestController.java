package com.boot.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
	
	@GetMapping(value="/")
	public String getGreetings() {
		
		return "Hello World!";
	}
}
