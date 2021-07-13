package com.resume.backend.database.mybatis.third;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.resume.backend.database.model.TestVo;

@Mapper
public interface ThirdMapper {

	List<TestVo> databaseTest(@Param("id")String id);
	
}