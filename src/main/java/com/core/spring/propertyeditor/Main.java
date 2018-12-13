package com.core.spring.propertyeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("PropertyTypeEditor.xml");
		Registration reg = (Registration) context.getBean("reg");
		
		reg.printDetails();
	}
	
}