package com.spring.aop.customannotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	 {
	  ApplicationContext appContext = new ClassPathXmlApplicationContext(
	    new String[] { "customaopannotaion.xml" });
	 
	  Employee employee = (Employee) appContext.getBean("employee");
	 
	  EmployeeService employeeService = (EmployeeService) appContext
	    .getBean("bloggerProxy");
	 
	  employeeService.save(employee);
	 }
	
}
