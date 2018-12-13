package com.core.spring.propertyeditor;

public class Registration {
	private User	 user;
	private UserType	userType;
	
	public void setUser(User user) {
		System.out.println("registration setUser ");
		this.user = user;
	}
	
	public void setUserType(UserType userType) {
		System.out.println("registration setUserType ");
		this.userType = userType;
	}
	
	public void printDetails() {
		System.out.println("UserId" + user.getId());
		System.out.println("Fname" + user.getFname());
		System.out.println("UserTypeId" + userType.getUser_type_id());
		System.out.println("UserTypeName" + userType.getUser_Type());
	}
}
