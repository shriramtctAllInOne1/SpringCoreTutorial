package com.spring.expression;

public class Item {
	private String	itemName;
	private int	   qty;
	
	public Item()
		{
			
		}
	
	public Item(String itemName, int qty)
		{
			super();
			this.itemName = itemName;
			this.qty = qty;
		}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [itemName=");
		builder.append(itemName);
		builder.append(", qty=");
		builder.append(qty);
		builder.append("]");
		return builder.toString();
	}
	
}
