package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.*;

@RestController
@RequestMapping("/index/")
public class indexController {
	@Autowired
	private monkey monkey;
	
	@RequestMapping("monkey")
	public monkey first() {
		return monkey;
	}
}
