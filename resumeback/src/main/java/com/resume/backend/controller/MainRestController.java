package com.resume.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@GetMapping("/test")
	public void testcont(String test) {
		
		System.out.println(test);
	}
}