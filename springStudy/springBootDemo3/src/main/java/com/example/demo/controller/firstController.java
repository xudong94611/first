package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.monkeyService;

@RestController
@RequestMapping("/index/")
public class firstController {
	@Autowired
	private monkeyService monkeyservice;
	
	@RequestMapping("monkey")
	public String monkey() {
		return monkeyservice.say();
	}
}
