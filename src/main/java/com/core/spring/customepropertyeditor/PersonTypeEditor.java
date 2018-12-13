package com.core.spring.customepropertyeditor;

import java.beans.PropertyEditorSupport;

public class PersonTypeEditor extends PropertyEditorSupport {
	
	public void setAsText(String text) {
		setValue(new PersonType(text.toUpperCase()));
	}
	
}
