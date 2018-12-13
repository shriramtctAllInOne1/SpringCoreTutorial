package com.spring.ioc.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {
	
	// auto wiring by name
	public static void main()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowire.xml");
		Account accobj= (Account)context.getBean("acc");
		Transaction txnobj= (Transaction)context.getBean("txn");
		System.out.println(txnobj.toString());
	}
	
	// auto wiring by type
	public static void main1()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowire.xml");
		Account accobj= (Account)context.getBean("acc1");
		Transaction txnobj= (Transaction)context.getBean("txn1");
		System.out.println(txnobj.toString());
	}
	// auto wiring by constructor
	public static void main2()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowire.xml");
		
		Account accobj= (Account)context.getBean("acc1");
		Transaction txnobj= (Transaction)context.getBean("txn2");
		System.out.println(txnobj.toString());
	}
	
	public static void main(String [] args)
	{
		//main();
		// main1();
		main1();
	}
	
}
