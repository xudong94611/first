package com.itheima.mybatis.junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.dao.UserDaoImpl;
import com.itheima.mybatis.pojo.User;

/**
 * 有dao
 * 
 * @author Xudong
 *
 */
public class MybatisDaoTest {

	public SqlSessionFactory sqlSessionFactory;

	@Before
	public void before() throws Exception {
		// 获取配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 创建session工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
	}

	@Test
	public void testDao() throws Exception {

		UserDao userDao = new UserDaoImpl(sqlSessionFactory);

		User user = userDao.selectUserById(10);
		System.out.println(user);
	}
}
