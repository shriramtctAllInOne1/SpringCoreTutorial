package com.spring.beannameaware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class MainApp {
	
	/**
	 * method to set beanNameAware interface
	 */
	public static void main() {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanNameAware.xml");
		Triangle obj = (Triangle) context.getBean("tringle");
		obj.setBeanName("tringleBean");
		obj.showBeanName();
	}
	
	/**
	 * method to set ApplicationContextAware
	 */
	public static void main1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanNameAware.xml");
		ContextBeanNameAwareEx obj = (ContextBeanNameAwareEx) context.getBean("contextAware");
		obj.setApplicationContext(context);
		obj.showContext();
	}
	
	public static void main2() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanNameAware.xml");
		context.registerShutdownHook();
	}
	
	public static void main3() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
		        new String[] { "ResourceLoader.xml" });
		
		ResourceLoaderEx resourceLoaderEx = (ResourceLoaderEx) appContext.getBean("resourceLoader");
		
		Resource resource = resourceLoaderEx.getResource("classpath:test.txt");
		
		try {
			InputStream is = resource.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// main();
		// main1();
		// main2();
		main3();
	}
	
}
