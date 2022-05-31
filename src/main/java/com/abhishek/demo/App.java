package com.abhishek.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien1 a = (Alien1)context.getBean("alien1");
		a.code();
//		System.out.println(a.getAge());
		a.com.compile();
	}
}