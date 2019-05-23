package com.itheima.mybatis.mapper;

import java.util.List;

import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;

public interface UserMapper {

	// ����Id��ȡһ������
	public User findUserById(Integer id);

	// ����������ȡ
	public List<User> findUserByQueryVo(QueryVo vo);

	// ��ȡ����������
	public Integer countUser();

	// ����һ������������ȡ
	public List<User> selectUserBySexAndUsername(User user);

	// ���ݶ��Id��ȡ
//	public List<User> selectUserByIds(Integer[] ids);array
	public List<User> selectUserByIds(List<Integer> ids);
//	public List<User> selectUserByIds(QueryVo vo);

}
