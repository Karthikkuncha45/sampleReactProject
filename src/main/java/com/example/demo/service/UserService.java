package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Boolean login(String username,String password) {
		return userRepository.findByUsername(username)
				.map(user->user.getPassword().equals(password))
				.orElse(false);
	}
	
}
