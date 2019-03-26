package com.xudong.springDemo3.springDemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/xudong/springDemo3/springDemo3/applicationContext.xml");
		CarFactory carFactory=(CarFactory) ctx.getBean("carFactory");
	    System.out.println(carFactory.toString());
	}
}
