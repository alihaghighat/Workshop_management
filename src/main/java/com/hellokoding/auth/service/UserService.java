package com.hellokoding.auth.service;

import java.util.List;

import com.hellokoding.auth.entity.User;

public interface UserService {
    public void save(User user);
    
    User findByUsername(String username);
    User findById(Long id);
   
}
