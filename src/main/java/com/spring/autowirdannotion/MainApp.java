package com.spring.autowirdannotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main1()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireAnnotation.xml");
		Customer customer = (Customer)context.getBean("customer");
		System.out.println(customer.toString());
		
	}
	
	public static void main2()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireAnnotation.xml");
		Customer1 customer1 = (Customer1)context.getBean("customer1");
		System.out.println(customer1.toString());
		
	}
	
	public static void main(String [] args)
	{
		main2();
		
	}
	
}
