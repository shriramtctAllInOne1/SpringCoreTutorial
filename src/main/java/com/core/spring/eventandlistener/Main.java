package com.core.spring.eventandlistener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String [] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("EventListnerBean.xml");
		MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
		publisher.publish();
	}
	
}
