package com.example.demo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Monkey;

@RestController
@RequestMapping("/index/")
public class firstController {
	
	@RequestMapping("first")
	public Monkey first() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/example/demo/bean/applicationContext.xml");
		Monkey monkey = (Monkey) ctx.getBean("monkey");
		System.out.println("first");
		return monkey;
	}
}
