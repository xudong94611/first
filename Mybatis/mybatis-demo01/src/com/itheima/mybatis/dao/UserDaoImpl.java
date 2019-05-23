package com.itheima.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.itheima.mybatis.pojo.User;

/**
 * Dao
 * 
 * @author lx
 *
 */
public class UserDaoImpl implements UserDao {

	// 声明Session工厂
	private SqlSessionFactory sqlSessionFactory;

	// 构造函数
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	// 通过id获取一个
	public User selectUserById(Integer id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession.selectOne("com.itheima.mybatis.mapper.UserMapper.findUserById", id);// 自己写dao要写清楚对应的是xml中的哪个方法
	}

	// 通过用户名获取
	public List<User> selectUserByUsername(String name) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession.selectList("com.itheima.mybatis.mapper.UserMapper.findUserByUsername", name);
	}

}
