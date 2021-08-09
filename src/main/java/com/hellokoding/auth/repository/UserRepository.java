package com.hellokoding.auth.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
	List<User> findByUsername(String username);


}
