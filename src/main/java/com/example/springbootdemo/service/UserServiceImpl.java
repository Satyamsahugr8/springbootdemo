package com.example.springbootdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springbootdemo.Entity.User;
import com.example.springbootdemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
		
	}
    @Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}
    
	@Override
	public User findById(@RequestBody long userId) {
		User s = null;
		return s;
	}
//	@Override
//	public User delete(User existingUser) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public User delete(User existingUser) {
		return null;
	}

	

}
