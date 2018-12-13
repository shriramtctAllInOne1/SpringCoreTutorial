package com.core.spring.customepropertyeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String [] args)
	{
		ApplicationContext  context = new ClassPathXmlApplicationContext("customePropertyEditor.xml");
		Person person = (Person)context.getBean("person");
		PersonType ptype = person.getPersonType();
		System.out.println(ptype.getType());
	}
	
}
