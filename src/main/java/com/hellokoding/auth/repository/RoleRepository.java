package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
