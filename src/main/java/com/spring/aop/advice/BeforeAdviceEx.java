package com.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.core.Ordered;

public class BeforeAdviceEx implements MethodBeforeAdvice,Ordered {

	@Override
    public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
	    System.out.println("BeforeAdviceEx before method: before Advice");
	    
    }

	@Override
    public int getOrder() {
	    return 0;
    }
	
}
