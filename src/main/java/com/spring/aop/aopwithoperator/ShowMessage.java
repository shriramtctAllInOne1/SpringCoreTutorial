package com.spring.aop.aopwithoperator;

public class ShowMessage {
	
	public void showMessage(MessageImpl messageImpl)
	{
		System.out.println("inside showMessage");
		messageImpl.showMsg1();
	}
	
	public void showMessage1(MessageImpl messageImpl)
	{
		System.out.println("inside showMessage");
		messageImpl.showMsg1();
	}
	
	
	
}
