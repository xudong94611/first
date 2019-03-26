package com.xudong.springDemo4.springDemo4;

import org.springframework.stereotype.Service;

@Service
public class Monkey {

	private String monkeyName = "MonkeyKing";

	public String toString() {
		return "MonkeyName:" + monkeyName;
	}

}
