package com.core.spring.propertyeditor;

public class User {
	private double	 id;
	private String	 fname;
	private UserType	userType;
	
	public double getId() {
		return id;
	}
	
	public void setId(double id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public UserType getUserType() {
		return userType;
	}
	
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}
