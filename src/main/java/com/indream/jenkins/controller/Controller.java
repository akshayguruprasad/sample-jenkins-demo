package com.indream.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/msg")
	public String method() {
		return "Welcome user, you are in Bridgelabz";
		
		
	}
}
