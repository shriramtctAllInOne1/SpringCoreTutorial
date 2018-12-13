package com.spring.listablebeanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListableBeanfactoryEx {
	
	public static void main() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
		        "ListableBeanfactory.xml");
		Customer customerObj = (Customer) appContext.getBean("mapBean");
		System.out.println(customerObj);
	}
	
	public static void main4() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
		        "ListableBeanfactory.xml");
		Customer customerObj = (Customer) appContext.getBean("mapstandaloneBean");
		System.out.println(customerObj);
	}
	
	public static void main1() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
		        "ListableBeanfactory.xml");
		Customer customerObj = (Customer) appContext.getBean("listableBean");
		System.out.println(customerObj);
	}
	
	public static void main2() {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext(
		        "ListableBeanfactory.xml");
		Customer customerObj1 = (Customer) appContext1.getBean("setableBean");
		System.out.println(customerObj1);
		
	}
	
	public static void main(String[] args) {
		main4();
	}
	
}
