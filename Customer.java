package com.programming.class1;

public class Customer {
	String custFName;
	String custLName;
	String custAddress;
	int age;
	
	public String getCustFName() {
		return custFName;
	}
	public void setCustFName(String custFName) {
		this.custFName = custFName;
	}
	public String getCustLName() {
		return custLName;
	}
	public void setCustLName(String custLName) {
		this.custLName = custLName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCustFName("ABC");
		c1.setCustLName("DEF");
		c1.setCustAddress("BLR");
		c1.setAge(20);
		
		System.out.println("First name of customer: " + c1.getCustFName());
		System.out.println("Last name of customer: " + c1.getCustLName());
		System.out.println("Age of customer: " + c1.getAge());
		System.out.println("Address: " + c1.getCustAddress());
	}

}
