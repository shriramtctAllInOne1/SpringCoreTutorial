package com.spring.customequalifier;

import org.springframework.beans.factory.annotation.Autowired;






public class Product {
	
	private String productName;
	private int productId;
	@Autowired
	@customeQurilifier("type1")
	private Type type;
	
	public Product()
	{
		
	}
	public Product(String productName, int productId, Type type)
	    {
		    super();
		    this.productName = productName;
		    this.productId = productId;
		    this.type = type;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
    public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Product [productName=");
	    builder.append(productName);
	    builder.append(", productId=");
	    builder.append(productId);
	    builder.append(", type=");
	    builder.append(type);
	    builder.append("]");
	    return builder.toString();
    }
	
	
}
