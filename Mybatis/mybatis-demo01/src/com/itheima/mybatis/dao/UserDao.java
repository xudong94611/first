package com.itheima.mybatis.dao;

import java.util.List;

import com.itheima.mybatis.pojo.User;

public interface UserDao {

	// ͨ��id��ȡһ��
	public User selectUserById(Integer id);

	// ͨ���û�����ȡ
	public List<User> selectUserByUsername(String name);
}
