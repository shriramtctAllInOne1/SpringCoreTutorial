package com.spring.ioc.dependency.check;

import org.springframework.beans.factory.annotation.Required;

/**
 * This program describe different way for dependency checking 
 * 
 * @author Ram
 *
 */
public class Person { 
	
	private String name;
	
	private String action;

	public String getName() {
		return name;
	}

	@CustomMandatory
	public void setName(String name) {
		this.name = name;
	}

	public String getAction() {
		return action;
	}
	@Required
	public void setAction(String action) {
		this.action = action;
	}

	@Override
    public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Person [name=");
	    builder.append(name);
	    builder.append(", action=");
	    builder.append(action);
	    builder.append(", getName()=");
	    builder.append(getName());
	    builder.append(", getAction()=");
	    builder.append(getAction());
	    builder.append(", getClass()=");
	    builder.append(getClass());
	    builder.append(", hashCode()=");
	    builder.append(hashCode());
	    builder.append(", toString()=");
	    builder.append(super.toString());
	    builder.append("]");
	    return builder.toString();
    }
	
	
}
