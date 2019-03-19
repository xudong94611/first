package com.xudong.hibernateTest3.hibernateTest3;

import javax.persistence.*;

@Entity
@Table(name = "school_inf")
public class school {
	@Id @Column(name="school_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="school_name")
	private String name;

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

	@Override
	public String toString() {
		return "school [id=" + id + ", name=" + name + "]";
	}
}
