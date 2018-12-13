package com.core.spring.eventandlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;


public class MyEventListener implements ApplicationListener<MyCustomEvent>  {

	@Override
    public void onApplicationEvent(MyCustomEvent event) {
		System.out.println("Event Listner ----:"+event);
	    
    }

	
	
}
