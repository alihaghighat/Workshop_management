package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.Grader;
import com.hellokoding.auth.entity.User;

public interface GraderRepository extends JpaRepository<Grader, Long> {
	
	//Grader findByUsername(String username);
}
