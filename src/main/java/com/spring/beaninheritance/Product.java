package com.spring.beaninheritance;

public class Product {
	
	private String	productName;
	private int	   productId;
	
	public Product()
		{
			
		}
	
	public Product(String productName, int productId)
		{
			super();
			this.productName = productName;
			this.productId = productId;
		}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productName=");
		builder.append(productName);
		builder.append(", productId=");
		builder.append(productId);
		builder.append("]");
		return builder.toString();
	}
	
}
