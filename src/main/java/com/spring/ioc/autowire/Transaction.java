package com.spring.ioc.autowire;

/**
 * Transaction class
 * 
 * @author Ram
 * 
 */
public class Transaction {
	
	private Account	acc;
	
	public Transaction()
	{
		
	}
	
//	public Transaction(Account acc)
//	    {
//		    super();
//		    this.acc = acc;
//	    }

	public Account getAcc() {
		return acc;
	}
	
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transaction [acc=");
		builder.append(acc);
		builder.append(", getAcc()=");
		builder.append(getAcc());
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
