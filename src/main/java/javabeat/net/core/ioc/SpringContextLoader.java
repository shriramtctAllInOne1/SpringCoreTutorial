package javabeat.net.core.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
	 
	public class SpringContextLoader {
	    public static void main (String args[]){
	        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-ioc.xml");
	        Transport transportCar = (Transport)applicationContext.getBean("springServiceCarInstance");
	        transportCar.getTransport();
	        Transport transportBus = (Transport)applicationContext.getBean("springServiceBusInstance");
	        transportBus.getTransport();
	        applicationContext.close();
    }
	}
