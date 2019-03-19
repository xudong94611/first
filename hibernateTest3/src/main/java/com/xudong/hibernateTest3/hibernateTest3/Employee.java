package com.xudong.hibernateTest3.hibernateTest3;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "employee_inf")
public class Employee {
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@OneToMany(targetEntity = school.class)
	@JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
	private List<school> schools = new ArrayList<school>();

	public Integer getId() {
		return id;
	}

	public List<school> getSchools() {
		return schools;
	}

	public void setSchools(List<school> schools) {
		this.schools = schools;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", schools=" + schools + "]";
	}

}
