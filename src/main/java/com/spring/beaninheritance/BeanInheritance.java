package com.spring.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanInheritance {
	
	public static void main(String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanInheritance.xml");
		Product product = (Product) context.getBean("childBean");
		System.out.println("Product Name : " + product.getProductName() );
		System.out.println("id : " + product.getProductId() ); 
	 
	}
}
