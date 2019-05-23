package com.itheima.mybatis.mapper;

import java.util.List;

import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;

public interface UserMapper {

	// 根据Id获取一个数据
	public User findUserById(Integer id);

	// 根据条件获取
	public List<User> findUserByQueryVo(QueryVo vo);

	// 获取数据总条数
	public Integer countUser();

	// 根据一个或多个条件获取
	public List<User> selectUserBySexAndUsername(User user);

	// 根据多个Id获取
//	public List<User> selectUserByIds(Integer[] ids);array
	public List<User> selectUserByIds(List<Integer> ids);
//	public List<User> selectUserByIds(QueryVo vo);

}
