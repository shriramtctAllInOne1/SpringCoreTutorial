package com.core.spring.messagesourcei18;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String [] args)
	{
		 ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"MessageBean.xml"});
			
		    MyExample myex= (MyExample)context.getBean("myexample");
		   myex.execute();
		    	
		    	
		    }
		

	}
	

