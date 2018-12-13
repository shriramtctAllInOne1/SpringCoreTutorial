package com.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;


public class ThrowAdviceEx implements ThrowsAdvice  {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("ThrowAdviceEx : ThrowAdvice!");
	}
	
}
