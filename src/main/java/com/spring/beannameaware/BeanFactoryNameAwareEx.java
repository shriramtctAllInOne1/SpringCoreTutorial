package com.spring.beannameaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BeanFactoryNameAwareEx implements BeanFactoryAware{

	@Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {

		System.out.println("bean factory name :---"+arg0);
    }
	
	public BeanFactoryNameAwareEx()
	{
		System.out.println("Bean initialzed");
	}
}
