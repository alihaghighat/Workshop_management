package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Workshop;

public interface WorkshopRepository extends JpaRepository<Workshop, Long> {
	
	Workshop findBySubject(String subject);
	
}
