package com.example.springbootdemo.service;

import java.util.List;

import com.example.springbootdemo.Entity.User;

public interface UserService {
	
	User saveUser(User user);


//	User getAllUsers(User user);


	List<User> getAllUsers();


	User findById(long userId);


	User delete(User existingUser);




	

}
