package com.spring.ioc.dependency.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static ApplicationContext context ;
	public static void main(String []args)
	{
		 context = new ClassPathXmlApplicationContext("Dependencychecker.xml");
		Person person= (Person)context.getBean("dchecker");
		System.out.println(person.toString());
	}
}
