package com.spring.ioc.collections;

public class Employee {
	
	String	name;
	String	address;
	int	   id;
	
	public Employee()
		{
			
		}
	
	public Employee(String name, String address, int id)
		{
			super();
			this.name = name;
			this.address = address;
			this.id = id;
		}
	
	public Employee(String name, String address)
		{
			super();
			this.name = name;
			this.address = address;
		}
	
	public Employee(String name, int id)
		{
			super();
			this.name = name;
			this.id = id;
		}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
}
