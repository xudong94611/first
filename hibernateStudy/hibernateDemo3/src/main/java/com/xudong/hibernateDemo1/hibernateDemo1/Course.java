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
@Table(name = "course_inf")
public class Course {
	@Id
	@Column(name = "cid")
	private Integer cid;
	@Column(name = "cname")
	private String cname;
	@ManyToMany(cascade=CascadeType.ALL,mappedBy = "courses")
	private Set<Student> students = new HashSet<Student>();

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", students=" + students + "]";
	}

}