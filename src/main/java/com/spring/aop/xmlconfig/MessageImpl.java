package com.spring.aop.xmlconfig;

public class MessageImpl implements Message {
	
	@Override
	public void showMsg1() {
		System.out.println("showMss1 :=======:BeforeAdvice");
		
	}
	
	@Override
	public void showMsg2() {
		System.out.println("showMss2 :=======:After");
		
	}
	
	@Override
	public void showMsg3() {
		System.out.println("showMss3 :=======:AfterReturningAdvice");
		
	}
	
	@Override
	public void showThrowException() {
		System.out.println("showThrowException :=======:ThrowAdvice");
		
	}
	
	@Override
	public void showAround() {
		System.out.println("showAround :=======:AroundAdvice");
		
	}
	
}
