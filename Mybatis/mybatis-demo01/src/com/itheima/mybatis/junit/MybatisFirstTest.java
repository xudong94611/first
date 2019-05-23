package com.itheima.mybatis.junit;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mybatis.pojo.User;

/**
 * 没有dao
 * 
 * @author Xudong
 *
 */
public class MybatisFirstTest {

	@Test
	public void testMybatis() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 通过id获得一个user
		User user = sqlSession.selectOne("com.itheima.mybatis.mapper.UserMapper.findUserById", 10);

		System.out.println(user);
	}

	@Test
	public void testfindUserByUsername() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 通过用户名获取（模糊查询）
		List<User> users = sqlSession.selectList("com.itheima.mybatis.mapper.UserMapper.findUserByUsername", "张");
		for (User user : users) {
			System.out.println(user);

		}
	}

	@Test
	public void testInsertUser() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 插入对象
		User user = new User();
		user.setUsername("徐木东");
		user.setBirthday(new Date());
		user.setAddress("sadfsafsafs");
		user.setSex("男");
		int i = sqlSession.insert("com.itheima.mybatis.mapper.UserMapper.insertUser", user);
		sqlSession.commit();

		System.out.println(user.getId());

	}

	@Test
	public void testUpdateUserById() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 修改
		User user = new User();
		user.setId(27);
		user.setUsername("熊海燕");
		user.setBirthday(new Date());
		// user.setAddress("222222sadfsafsafs");
		user.setSex("女");
		int i = sqlSession.update("com.itheima.mybatis.mapper.UserMapper.updateUserById", user);// 会把空值也修改进去
		sqlSession.commit();
	}

	@Test
	public void testDelete() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 删除
		sqlSession.delete("com.itheima.mybatis.mapper.UserMapper.deleteUserById", 27);
		sqlSession.commit();
	}
}
