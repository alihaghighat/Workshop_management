package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.WorkshopRelation;

public interface WorkshopRelationRepository extends JpaRepository<WorkshopRelation, Long> {
	
	
}
