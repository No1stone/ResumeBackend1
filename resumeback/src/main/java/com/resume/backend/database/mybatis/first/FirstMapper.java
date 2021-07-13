package com.resume.backend.database.mybatis.first;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.resume.backend.database.model.TestVo;

@Mapper
public interface FirstMapper {

	List<TestVo> databaseTest(@Param("id")String id);
	
}