package com.hellokoding.auth.service;

import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.repository.RoleRepository;
import com.hellokoding.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

   
    @Override
    public void save(User user) {
    	if ( user.getPassword() != null )
    		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
    	List<User> users = userRepository.findByUsername(username); 		
        
    	if ( users.size() > 0 )
    		return users.get(0);
    	else {
			return null;
		}
    }

	@Override
	public User findById(Long id) {
		List<User> users = userRepository.findAll();
		
		for (User user : users) {
			if ( user.getId() == id) {
				return user;
			}
		}
		
		
		return null;
	}
}
