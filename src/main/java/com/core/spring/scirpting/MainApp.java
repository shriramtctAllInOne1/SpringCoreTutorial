package com.core.spring.scirpting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String [] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("rubyScripting.xml");
		InterestCalculator interestObj= (InterestCalculator)context.getBean("interestCalculator");
		System.out.println("--calculate"+interestObj.calculate(10, 10));
	}
	
}
