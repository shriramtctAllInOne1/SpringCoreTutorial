package com.spring.ioc.autowire;

/**
 * Account class
 * @author Ram
 *
 */
public class Account {
	private int	accNo;
	private String	accHolder;
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getAccHolder() {
		return accHolder;
	}
	
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	@Override
    public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Account [accNo=");
	    builder.append(accNo);
	    builder.append(", accHolder=");
	    builder.append(accHolder);
	    builder.append("]");
	    return builder.toString();
    }
	
}
