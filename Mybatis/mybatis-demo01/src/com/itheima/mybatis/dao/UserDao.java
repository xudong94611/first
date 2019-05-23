package com.itheima.mybatis.dao;

import java.util.List;

import com.itheima.mybatis.pojo.User;

public interface UserDao {

	// 通过id获取一个
	public User selectUserById(Integer id);

	// 通过用户名获取
	public List<User> selectUserByUsername(String name);
}
