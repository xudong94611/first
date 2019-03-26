package com.xudong.springDemo2.springDemo2;

import org.springframework.beans.factory.annotation.Autowired;

public class Zoo {
	@Autowired(required = false)
	private Tiger tiger;
	@Autowired(required = false)
	private Monkey monkey;

	@Override
	public String toString() {
		return "Zoo [tiger=" + tiger + ", monkey=" + monkey + "]";
	}

}
