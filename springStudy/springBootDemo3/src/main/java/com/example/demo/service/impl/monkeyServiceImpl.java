package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.monkeyService;

@Service
public class monkeyServiceImpl implements monkeyService{

	@Override
	public String say() {
		return "hello";
	}

	@Override
	public String laugh() {
		return "haha";
	}

}
