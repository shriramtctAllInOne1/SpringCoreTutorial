package com.core.spring.customepropertyeditor;

public class Person {
	
	private String	   name;
	
	private PersonType	personType;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PersonType getPersonType() {
		return personType;
	}
	
	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", personType=");
		builder.append(personType);
		builder.append("]");
		return builder.toString();
	}
	
}
