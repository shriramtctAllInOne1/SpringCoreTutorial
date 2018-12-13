package com.spring.aop.within;

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
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPwithin.xml");
		Message message = (Message) appContext.getBean("message");
		message.showMsg1();
			
	}
	
	public static void main1(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPwithin.xml");
		Message message = (Message) appContext.getBean("message");
		message.showMsg2();
			
	}
	
	public static void main3(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPwithin.xml");
		Message message = (Message) appContext.getBean("message");
		message.showMsg3();
			
	}
	public static void main4(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPwithin.xml");
		Message message = (Message) appContext.getBean("message");
		message.showThrowException();
			
	}
	
	public static void main5(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPwithin.xml");
		Message message = (Message) appContext.getBean("message");
		message.showAround();
			
	}
	
	public static void main(String [] args)
	{
		
		main();
		//main1();


	}
	
}
