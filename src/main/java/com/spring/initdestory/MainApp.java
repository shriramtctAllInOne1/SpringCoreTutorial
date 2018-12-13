package com.spring.initdestory;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Init-Destory_Bean.xml");
		Cashier cashObj = (Cashier) context.getBean("cash1");
		try {
			cashObj.WriteToFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
