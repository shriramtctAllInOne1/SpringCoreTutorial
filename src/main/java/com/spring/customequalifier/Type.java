package com.spring.customequalifier;

public class Type {
	
	private String	type;
	
	public Type()
	{
		
	}
	
	public Type(String type)
		{
			super();
			this.type = type;
		}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Type [type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
	
}
