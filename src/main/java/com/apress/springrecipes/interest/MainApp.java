package com.apress.springrecipes.interest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context =
		new ClassPathXmlApplicationContext("Rbean.xml");
		InterestCalculator calculator =
		(InterestCalculator) context.getBean("interestCalculator");
		System.out.println(calculator.calculate(100000, 1));
	
}
}
