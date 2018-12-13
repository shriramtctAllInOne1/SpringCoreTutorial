package com.core.spring.propertyeditor;

import java.beans.PropertyEditorSupport;

public class UserTypeEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) {
		double test = Double.valueOf(text);
		UserType userType = new UserType(test);
		setValue(userType);
	}
	
	@Override
	public String getAsText() {
		UserType userType = (UserType) getValue();
		return userType.toString();
	}
	
}
