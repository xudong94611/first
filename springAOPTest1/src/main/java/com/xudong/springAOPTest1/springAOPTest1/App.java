package com.xudong.springAOPTest1.springAOPTest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/xudong/springAOPTest1/springAOPTest1/Beans.xml");
		Student student = (Student) context.getBean("student");
		student.getName();
		student.getAge();
		student.printThrowException();
	}
}
