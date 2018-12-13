package com.spring.aop.advice;

public class CustomerService {
	
	private String	name;
	private String	url;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void printName() {
		System.out.println("Name ---:" + this.name);
	}
	
	public void printUrl() {
		System.out.println("Url---:" + this.url);
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
	
}
