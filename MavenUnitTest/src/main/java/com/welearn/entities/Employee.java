package com.welearn.entities;


public class Employee {
	private String name;
	private Integer age;
	
	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public boolean isRetried()
	{
		return age>= EmployeeConstants.RETIRE_AGE;
	}
}
