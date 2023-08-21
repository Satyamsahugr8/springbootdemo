package com.example.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	
}
