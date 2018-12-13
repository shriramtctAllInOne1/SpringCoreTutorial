package com.spring.aop.advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.core.Ordered;

public class AfterAdviceEx implements AfterAdvice,Ordered {
	
	public void afterMethod()
	{
		System.out.println("afterAdvice method");
	}

	@Override
    public int getOrder() {
	    return 1;
    }
	
}
