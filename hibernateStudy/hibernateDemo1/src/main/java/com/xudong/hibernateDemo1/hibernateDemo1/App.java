package com.xudong.hibernateDemo1.hibernateDemo1;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		ArrayList<school> schools = new ArrayList<school>();
		school school1 = new school();
		school1.setName("xiaoxue");
		school school2 = new school();
		school2.setName("zhongxue");
		school school3 = new school();
		school3.setName("gaozhong");
		school school4 = new school();
		school4.setName("daxue");
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		schools.add(school4);
		person person1 = new person();
		person1.setAge(11);
		person1.setName("xd");
		person1.setSchools(schools);
		s.save(person1);
		s.getTransaction().commit();
		s.close();

	}
}
