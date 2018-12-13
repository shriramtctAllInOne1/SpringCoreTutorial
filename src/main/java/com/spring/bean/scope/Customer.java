package com.spring.bean.scope;

public class Customer {
	
	private String	message;
	
	public Customer()
		{
			
		}
	
	public Customer(String message)
		{
			super();
			this.message = message;
		}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}
