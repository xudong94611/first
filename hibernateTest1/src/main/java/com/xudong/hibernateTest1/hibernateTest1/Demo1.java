package com.xudong.hibernateTest1.hibernateTest1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo1 {
	private static SessionFactory sessionFactory = null;
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setAge(12);
		employee.setName("xd");
		List<String> schools = new ArrayList<String>();
		schools.add("xiaoxue");
		schools.add("zhognxue");
		employee.setSchools(schools);
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setAge(22);
		employee2.setName("xhy");
		List<String> schools2 = new ArrayList<String>();
		schools2.add("xiaoxue");
		schools2.add("zhognxue");
		employee2.setSchools(schools2);
		try {
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(employee);
			session.save(employee2);
			session.getTransaction().commit();
			System.out.println("成功");
		} catch (Exception e) {
			System.err.println("创建会话工厂失败");
			e.printStackTrace();
		}
	}
}
