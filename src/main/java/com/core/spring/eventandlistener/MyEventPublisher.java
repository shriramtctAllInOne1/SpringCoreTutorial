package com.core.spring.eventandlistener;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyEventPublisher implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher	applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void publish() {
		applicationEventPublisher.publishEvent(new MyCustomEvent(this));
	}
	
}
