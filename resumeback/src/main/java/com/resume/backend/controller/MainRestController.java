package com.resume.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.resume.backend.database.mybatis.MybatisService;

@RestController
public class MainRestController {

	@Autowired
	private MybatisService ms;
	
	@GetMapping("/test1")
	public void testcont1(@RequestParam("id") String id) {
		System.out.println(id);
		ms.TestFirst(id);
	}
	
	@GetMapping("/test2")
	public void testcont2(@RequestParam("id") String id) {
		System.out.println(id);
		ms.TestSecond(id);
	}
	
	@GetMapping("/test3")
	public void testcont3(@RequestParam("id") String id) {
		System.out.println(id);
		ms.TestThird(id);
	}
}