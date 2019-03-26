package com.xudong.hibernateDemo1.hibernateDemo1;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="person_inf")
public class person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="person_id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name="person_name")
	private String name;
	
	@Column(name="person_age")
	private Integer age;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id")
	private List<school> schools;
	
	public List<school> getSchools() {
		return schools;
	}
	public void setSchools(List<school> schools) {
		this.schools = schools;
	}
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + ", schools=" + schools + "]";
	}

}
