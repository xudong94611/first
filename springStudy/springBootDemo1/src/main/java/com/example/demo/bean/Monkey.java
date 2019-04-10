package com.example.demo.bean;

import org.springframework.stereotype.Service;

@Service("monkey")
public class Monkey {

	private String monkeyName = "MonkeyKing";

	public String getMonkeyName() {
		return monkeyName;
	}

	public void setMonkeyName(String monkeyName) {
		this.monkeyName = monkeyName;
	}

	public String toString() {
		return "MonkeyName:" + monkeyName;
	}

}
