package com.example.demo.servcie;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserExample;

public interface UserService {
//	int countByExample(UserExample example);
//
//	int deleteByExample(UserExample example);
//
//	int deleteByPrimaryKey(Integer id);
//
//	int insert(User record);
//
//	int insertSelective(User record);
//
//	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer id);

//	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);
//
//	int updateByExample(@Param("record") User record, @Param("example") UserExample example);
//
//	int updateByPrimaryKeySelective(User record);
//
//	int updateByPrimaryKey(User record);
}
