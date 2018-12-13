package com.spring.customequalifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierApp {
	
	public static void main() {
		ApplicationContext context = new ClassPathXmlApplicationContext("CustomQualifier.xml");
		Product product = (Product) context.getBean("customQ");
		System.out.println("Product Name : " + product.getProductName() );
		System.out.println("id : " + product.getProductId() ); 
		Type productType = product.getType(); 
		System.out.println(product.getProductName()+" is of type:" + productType.getType() ); 
	}
	
	public static void main(String[] args) {
		main();
	}
}
