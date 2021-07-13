package com.resume.backend.database.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.backend.database.model.TestVo;
import com.resume.backend.database.mybatis.first.FirstMapper;
import com.resume.backend.database.mybatis.second.SecondMapper;
import com.resume.backend.database.mybatis.third.ThirdMapper;

@Service
public class MybatisService {

	@Autowired
	private FirstMapper fist;
	@Autowired
	private SecondMapper second;
	@Autowired
	private ThirdMapper third;
	
	public void TestFirst(String id) {
		System.out.println("id확인"+id);
		List<TestVo> test = fist.databaseTest(id);
	 
		for(TestVo e: test)
		System.out.println(e.getId()+e.getPw());
		
		
	}
	
	
	
	
}
