package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.GraderRequest;

public interface RequestRepository extends JpaRepository<GraderRequest, Long>{

}
	