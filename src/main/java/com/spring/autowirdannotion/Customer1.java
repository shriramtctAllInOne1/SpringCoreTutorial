package com.spring.autowirdannotion;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer1 {
	
	int	   type;
	String	action;
	Person	person;
	
	public Customer1()
		{
			
		}
	
	public Customer1(int type, String action, Person person)
		{
			super();
			this.type = type;
			this.action = action;
			this.person = person;
		}
	
	@Autowired
	public Customer1( Person person)
	{
		super();
		this.person = person;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public Person getPerson() {
		return person;
	}
	
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [type=");
		builder.append(type);
		builder.append(", action=");
		builder.append(action);
		builder.append(", person=");
		builder.append(person);
		builder.append("]");
		return builder.toString();
	}
	
}
