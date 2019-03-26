package com.xudong.springDemo4.springDemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("xudongZoo")
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
