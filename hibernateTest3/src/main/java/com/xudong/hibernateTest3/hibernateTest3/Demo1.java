package com.xudong.hibernateTest3.hibernateTest3;

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
		List<school> schools = new ArrayList<school>();
		school school1 = new school();
		school1.setName("xiaoxue");
		school school2 = new school();
		school2.setName("chuzhong");
		schools.add(school1);
		schools.add(school2);
		employee.setSchools(schools);

		try {
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.persist(school1);
			session.persist(school2);
			session.save(employee);
			session.getTransaction().commit();
			System.out.println("成功");
		} catch (Exception e) {
			System.err.println("创建会话工厂失败");
			e.printStackTrace();
		}
	}
}
