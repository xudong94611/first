package com.xudong.hibernateDemo1.hibernateDemo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		student1.setSid(1);
		student2.setSid(2);
		student3.setSid(3);
		student1.setSname("a");
		student2.setSname("b");
		student3.setSname("c");
		Set<Student> students = new HashSet<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		course1.setCid(1);
		course2.setCid(2);
		course3.setCid(3);
		course1.setCname("math");
		course2.setCname("chinese");
		course3.setCname("english");
		Set<Course> courses = new HashSet<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		student1.setCourses(courses);
		student2.setCourses(courses);
		student3.setCourses(courses);
		
		s.save(student1);
		s.save(student2);
		s.save(student3);
		s.getTransaction().commit();
		s.close();

	}
}
