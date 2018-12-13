package com.core.spring.eventandlistener;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class MyCustomEvent extends ApplicationEvent{

	public MyCustomEvent(Object source)
	    {
		    super(source);
	    }
	
}
