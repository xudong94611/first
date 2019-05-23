package com.itheima.mybatis.junit;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mybatis.mapper.UserMapper;
import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;

public class MybatisMapperTest {

	@Test
	public void testMapper() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 获取mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		// 根据Id获取
		User user = userMapper.findUserById(10);
		System.out.println(user);
	}

	@Test
	public void testMapperQueryVo() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 获取mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		// 创建查询条件对象
		QueryVo vo = new QueryVo();
		// 创建user对象
		User user = new User();
		// 设置条件
		user.setUsername("张三");// xml里写的是username
		vo.setUser(user);

		List<User> users = userMapper.findUserByQueryVo(vo);
		for (User user1 : users) {
			System.out.println(user1);

		}
	}

	@Test
	public void testMapperQueryVoCOunt() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 获取mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		// 获取数据总条数
		Integer i = userMapper.countUser();
		System.out.println(i);
	}

	@Test
	public void testfindUserBySexAndUsername() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 获取mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		User user = new User();
		user.setSex("1");
		user.setUsername("张三");

		// 多条件查询
		List<User> users = userMapper.selectUserBySexAndUsername(user);
		for (User user2 : users) {
			System.out.println(user2);
		}
	}

	@Test
	public void testfindUserIDs() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 获取mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<Integer> ids = new ArrayList<>();
		ids.add(16);
		ids.add(22);
		ids.add(24);
		/*
		 * QueryVo vo = new QueryVo(); vo.setIdsList(ids);
		 */

//		List<User> users = userMapper.selectUserByIds(vo);
		/*
		 * Integer[] ids = new Integer[3]; ids[0] = 16; ids[2] = 22; ids[1] = 24;
		 */
		// 根据多个Id获取
		List<User> users = userMapper.selectUserByIds(ids);
		for (User user2 : users) {
			System.out.println(user2);
		}
	}
}
