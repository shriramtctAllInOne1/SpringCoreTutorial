package com.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"BeanScope.xml"});
		Customer customerobjA=(Customer)context.getBean("customerService");
		customerobjA.setMessage("message recieved by custoner A");
		System.out.println("Message:"+customerobjA.getMessage());
		Customer customerobjB=(Customer)context.getBean("customerService");
		System.out.println("Message:"+customerobjB.getMessage());
	}
	
	public static void main1()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"BeanScope.xml"});
		Customer customerobjA=(Customer)context.getBean("customerService1");
		customerobjA.setMessage("message recieved by custoner A");
		System.out.println("Message:"+customerobjA.getMessage());
		Customer customerobjB=(Customer)context.getBean("customerService");
		System.out.println("Message:"+customerobjB.getMessage());
	}
	
	public static void main(String [] args)
	{
		// main();
		main1();
	}
	
}
