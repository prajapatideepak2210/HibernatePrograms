package com.bridgelabz.model;

/**
 * @author Deepak Prajapati
 * @Description This class is a model class here you will find some properties of Employee.
 *
 */
public class Employee {
	
	private int employeeId;  
	private String name,email;  
	private Address address;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}  