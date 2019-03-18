package com.xudong.hibernateTest1.hibernateTest1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Integer id;
	private String name;
	private int age;
	private List<String> schools = new ArrayList<String>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public List<String> getSchools() {
		return schools;
	}
	public void setSchools(List<String> schools) {
		this.schools = schools;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", schools=" + schools + "]";
	}

	
}
