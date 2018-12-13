package com.spring.beannameaware;

import org.springframework.beans.factory.BeanNameAware;

public class Triangle implements BeanNameAware {
	
	int	   a;
	String	name;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	@Override
	public void setBeanName(String name) {
		this.name=name;
	}
	
	public void showBeanName()
	{
		System.out.println("Bean name:---"+name);
	}
	
}
