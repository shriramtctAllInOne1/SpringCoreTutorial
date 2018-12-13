package com.spring.aop.withinannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This program used to show how to use within in aop . it is used for type signature pattern.
 * 
 * If you want to apply aop at package or class level this use within.
 * 
 * @author Ram
 *
 */
public class MainApp {
	
	public static void main(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOP_WithinAnnotaion.xml");
		MessageImpl message = (MessageImpl) appContext.getBean("message");
		message.showMsg1();
			
	}
	
	
	
	public static void main(String [] args)
	{
		
		main();
		//main1();


	}
	
}
