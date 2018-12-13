package com.spring.ioc.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ram
 * 
 */
public class MainApp {
	/**
	 * @param args
	 */
	
	@SuppressWarnings("resource")
	public static void main() {
		// ApplicationContext appContext = new
		// ClassPathXmlApplicationContext("CollectionBean.xml");
		// BeanwithCollection
		// obj=(BeanwithCollection)appContext.getBean("collectionsid");
		// System.out.println("List--------------"+obj.getList());
		// System.out.println("Set--------------"+obj.getSet());
		// System.out.println("Map--------------"+obj.getMap());
		// System.out.println("props--------------"+obj.getProps());
		
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("CollectionMerge.xml");
		BeanwithCollection obj1 = (BeanwithCollection) appContext1.getBean("childProps");
		System.out.println("props--------------" + obj1.getProps());
		
	}
	
	@SuppressWarnings("resource")
	public static void main1() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("CollectionBean.xml");
		BeanwithCollection obj = (BeanwithCollection) appContext.getBean("collectionsid");
		System.out.println("List--------------" + obj.getList());
		System.out.println("Set--------------" + obj.getSet());
		System.out.println("Map--------------" + obj.getMap());
		System.out.println("props--------------" + obj.getProps());
		
	}
	
	@SuppressWarnings("resource")
	public static void main2() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("CollectionBean.xml");
		BeanwithCollection obj = (BeanwithCollection) appContext.getBean("collectionsid");
		System.out.println("List--------------" + obj.getList());
		System.out.println("Set--------------" + obj.getSet());
		System.out.println("Map--------------" + obj.getMap());
		System.out.println("props--------------" + obj.getProps());
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		main();
	}
	
}
