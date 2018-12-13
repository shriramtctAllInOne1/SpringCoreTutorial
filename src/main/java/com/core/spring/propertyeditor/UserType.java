package com.core.spring.propertyeditor;

public class UserType {
	private double	user_type_id;
	private String	user_Type;
	
	public UserType(double user_type_id)
		{
			super();
			this.user_type_id = user_type_id;
		}
	
	public UserType()
		{
			super();
		}
	
	public double getUser_type_id() {
		return user_type_id;
	}
	
	public void setUser_type_id(double user_type_id) {
		this.user_type_id = user_type_id;
	}
	
	public String getUser_Type() {
		return user_Type;
	}
	
	public void setUser_Type(String user_Type) {
		this.user_Type = user_Type;
	}
}