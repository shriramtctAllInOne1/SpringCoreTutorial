package com.spring.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main() {
		ApplicationContext context = new ClassPathXmlApplicationContext("AOPBean.xml");
		CustomerService customer = (CustomerService) context.getBean("beforeadviceProxy");
		customer.printName();
		customer.printUrl();
	}
	
	public static void main1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("AOPBean.xml");
		CustomerService customer = (CustomerService) context.getBean("afteradviceProxy");
		customer.printName();
		customer.printUrl();
		
	}
	
	public static void main2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("AOPBean.xml");
		CustomerService customer = (CustomerService) context.getBean("throwAdviceProxy");
		customer.printThrowException();
		// customer.printUrl();
	}
	
	public static void main3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("AOPBean.xml");
		CustomerService customer = (CustomerService) context.getBean("aroundAdviceProxy");
		customer.printName();
		customer.printUrl();
		customer.printThrowException();
		
	}
	
	public static void main(String[] args) {
		main1();
	}
}
