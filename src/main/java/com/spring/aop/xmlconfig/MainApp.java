package com.spring.aop.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPBeanAS.xml");
		Message message = (Message) appContext.getBean("message");
		message.showMsg1();
			
	}
	
	public static void main1(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPBeanAS.xml");
		Message message = (Message) appContext.getBean("message");
		message.showMsg2();
			
	}
	
	public static void main3(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPBeanAS.xml");
		Message message = (Message) appContext.getBean("message");
		message.showMsg3();
			
	}
	public static void main4(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPBeanAS.xml");
		Message message = (Message) appContext.getBean("message");
		message.showThrowException();
			
	}
	
	public static void main5(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPBeanAS.xml");
		Message message = (Message) appContext.getBean("message");
		message.showAround();
			
	}
	
	public static void main(String [] args)
	{
		
		main5();


	}
	
}
