package com.xudong.hibernateDemo1.hibernateDemo1;

import javax.persistence.*;

@Entity
@Table(name = "school_inf")
public class school {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_id", unique = true, nullable = false)
	private Integer id;
	@Column(name="school_name")
	private String name;

	@Override
	public String toString() {
		return "school [id=" + id + ", name=" + name + "]";
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

}
