package com.resume.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.resume.backend.database.jpa.entity.first.Member;
import com.resume.backend.database.jpa.service.MemberRepository;
import com.resume.backend.database.mybatis.MybatisService;

@RestController
public class MainRestController {

	@Autowired
	private MybatisService ms;
	
	@Autowired
	private MemberRepository memberRepository;
	
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
	
	@GetMapping("/test4")
	public void testcont4(@RequestParam("id") String id,@RequestParam("pw") String pw) {
		System.out.println("id value: "+id+"pw value: "+pw);
		memberRepository.save(new Member("a", 10));
		memberRepository.save(new Member("b", 15));
		memberRepository.save(new Member("c", 20));
		memberRepository.save(new Member("a", 25));
		
		Iterable<Member> list1 = memberRepository.findAll();
		
		System.out.println("find all");
				
		for(Member m : list1) {
			System.out.println(m.toString());
		}
		
	
	}
	
}