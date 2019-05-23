package com.itheima.mybatis.junit;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mybatis.mapper.UserMapper;
import com.itheima.mybatis.pojo.User;

/**
 * 使用动态代理（Mapper）相当于mybatis自动生成dao
 * 
 * @author Xudong
 *
 */
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

		// 获取对应的mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		// 根据Id获取数据
		User user = userMapper.findUserById(10);
		System.out.println(user);
	}
}
