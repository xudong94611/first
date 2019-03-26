package com.xudong.springDemo1.springDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/xudong/springDemo1/springDemo1/applicationContext.xml");
		Zoo zoo = (Zoo) ctx.getBean("zoo");
		System.out.println(zoo.toString());
	}
}
