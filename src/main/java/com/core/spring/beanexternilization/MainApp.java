package com.core.spring.beanexternilization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	// http://www.baeldung.com/2012/02/06/properties-with-spring/
	public static void main()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanExternalization.xml");
		MyDbConfig dbConfigobj= (MyDbConfig)context.getBean("dbConfig");
		System.out.println(dbConfigobj.toString());
		
	}
	public static void main1()
	{
		
	}
	public static void main(String []args)
	{
		main();
	}
	
}
