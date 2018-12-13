package com.spring.aop.arg;

public class ShowMessage {
	
	public void showMessage(MessageImpl messageImpl)
	{
		System.out.println("inside showMessage");
		messageImpl.showMsg1();
	}
	
}
