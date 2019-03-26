package com.xudong.springDemo4.springDemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/xudong/springDemo4/springDemo4/applicationContext.xml");
		Zoo zoo = (Zoo) ctx.getBean("xudongZoo");
		System.out.println(zoo.toString());
	}
}
