package com.spring.aop.annotation;


public class MessageImpl  {
	@Messanger
	public void showMsg1() {
		System.out.println("showMss1 :=======:BeforeAdvice");
		
	}
	
}
