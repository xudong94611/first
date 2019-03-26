package com.xudong.hibernateDemo1.hibernateDemo1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_inf")
public class Student {
	@Id
	@Column(name="sid")
	private Integer sid;
	@Column(name="sname")
	private String sname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course", 
	joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "sid")}, 
	inverseJoinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "cid")})
	private Set<Course> courses = new HashSet<Course>();

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", courses=" + courses + "]";
	}

}
