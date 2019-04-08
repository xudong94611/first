package com.example.demo.bean;

import org.springframework.stereotype.Service;

@Service
public class monkey {
	private String name = "abc";
	private int age = 1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "monkey [name=" + name + ", age=" + age + "]";
	}
	
}
