package com.example.springbootdemo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	int id;
	String firstName;
	String LastName;
	int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
	}

	public User() {
		super();
	}

}
