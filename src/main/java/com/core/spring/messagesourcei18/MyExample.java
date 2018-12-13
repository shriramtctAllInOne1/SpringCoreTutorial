package com.core.spring.messagesourcei18;

import org.springframework.context.MessageSource;

public class MyExample {
	private MessageSource	messages;
	
	public void setMessages(MessageSource messages) {
		this.messages = messages;
	}
	
	public void execute() {
		String message = this.messages.getMessage("field.required", new Object[] { "UserName" },
		        "Required", null);
		System.out.println(message);
	}
}