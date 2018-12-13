package com.spring.aop.xmlconfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	public void logBefore(JoinPoint joinpoint) {
		System.out.println("logBefore() is running!");
		System.out.println("JoinPoint Information : " + joinpoint.getSignature().getName());
		
	}
	
	public void logAfter(JoinPoint joinpoint) {
		System.out.println("logAfter() is running!");
		System.out.println("JoinPoint Information : " + joinpoint.getSignature().getName());
		
	}
	
	public void logAfterReturning(JoinPoint joinpoint) {
		System.out.println("logAfterReturning() is running!");
		System.out.println("JoinPoint Information : " + joinpoint.getSignature().getName());
		
	}
	
	public void logAfterThrowing(JoinPoint joinpoint, Throwable error) {
		System.out.println("logAfterThrowing() is running!"+error);
		System.out.println("JoinPoint Information : " + joinpoint.getSignature().getName());
		
	}
	
	public void logAround(ProceedingJoinPoint pjoinpoint) {
		System.out.println("logAround() is running!");
		System.out.println("JoinPoint Information : " + pjoinpoint.getSignature().getName());
		
	}
}
