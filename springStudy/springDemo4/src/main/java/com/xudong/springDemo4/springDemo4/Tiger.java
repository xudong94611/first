package com.xudong.springDemo4.springDemo4;

import org.springframework.stereotype.Service;

@Service
public class Tiger {

	private String tigerName = "TigerKing";

	public String toString() {
		return "TigerName:" + tigerName;
	}
}
