package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;
import com.example.demo.servcie.UserService;

@RestController("/first")
public class firstController {

	@Autowired
	UserService userService;

	// 显示“hello world”
	@RequestMapping("/hello")
	public String showHello() {
		return "hello world";
	}

	// 显示对象json串
	@RequestMapping("/pojo")
	public User showUser() {
		User user = new User();
		user.setUsername("xd");
		user.setId(18);
		user.setSex("男");
		return user;
	}

	// 显示map
	@RequestMapping("/map")
	public Map<String, Object> showMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("姓名", "徐栋");
		map.put("age", 18);
		return map;
	}

	// 显示List
	@RequestMapping("/list")
	public List<User> showList() {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		user1.setUsername("1");
		user2.setUsername("2");
		user3.setUsername("3");
		ArrayList<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		return list;
	}

	// 调用mybatis
	@RequestMapping("/mybatis")
	public User showMybatis() {
		User user = userService.selectByPrimaryKey(1);
		return user;
	}
}
