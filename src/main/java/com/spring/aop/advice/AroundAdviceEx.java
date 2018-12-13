package com.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdviceEx implements MethodInterceptor {
	
	@Override
	public Object invoke(MethodInvocation arg) throws Throwable {
		
		System.out.println("Method Name:" + arg.getMethod().getName());
		System.out.println("Method args:" + arg.getArguments());
		System.out.println("-----------------same like methodBeforeadvice-------");
		try {
			Object result = arg.proceed();
			System.out.println("---------similar to afterReturingadvice----");
			return result;
		} catch (IllegalArgumentException ae) {
			System.out.println("---------similar to throwadvice----");
			throw ae;
		}
		
	}
	
}
