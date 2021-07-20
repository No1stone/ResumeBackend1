package com.resume.backend.database.jpa.service;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resume.backend.database.jpa.entity.first.Member;

@Repository
@EntityScan("com.resume.backend.database.jpa.entity.first")
@EnableJpaRepositories
public interface MemberRepository extends CrudRepository<Member, Long> {

	List<Member> findByNameAndAgeLessThan(String name, int age);

	@Query("select t from Member t where name=:name and age < :age")
	List<Member> findByNameAndAgeLessThanSQL(@Param("name") String name, @Param("age") int age);

	List<Member> findByNameAndAgeLessThanOrderByAgeDesc(String name, int age);

}
