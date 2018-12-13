package com.spring.expression;

public class Customer {
	
	private Item	item;
	
	private String	itemName;
	
	public Customer()
		{
			
		}
	
	public Customer(Item item, String itemName)
		{
			super();
			this.item = item;
			this.itemName = itemName;
		}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [item=");
		builder.append(item);
		builder.append(", itemName=");
		builder.append(itemName);
		builder.append("]");
		return builder.toString();
	}
	
}
