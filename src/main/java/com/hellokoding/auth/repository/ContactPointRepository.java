package com.hellokoding.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.ContactPoint;
import com.hellokoding.auth.entity.ContactType;
import com.hellokoding.auth.entity.User;


public interface ContactPointRepository extends JpaRepository<ContactPoint,Long>{
	List<ContactPoint> findByContactData(String contactData);
	List<ContactPoint> findByType(ContactType type);
	
}
