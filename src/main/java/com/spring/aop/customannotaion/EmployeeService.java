package com.spring.aop.customannotaion;

public class EmployeeService {
	@NotNullAndNotEmpty
	public void save(Employee employee) {
		System.out.println("EmployeeService.save() successfully");
	}
}
