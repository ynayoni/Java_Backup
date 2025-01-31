package com.programming.class1;

public class Employee {
	// non static instance variables
	String empName;
	int empAge;
	String empDesignation;
	double empSalary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setEmpName("AMI");
		emp.setEmpAge(20);
		emp.setEmpDesignation("Software Engineer");
		emp.setEmpSalary(70000.0D);
		
		System.out.println("Name of the employee: " + emp.getEmpName());
		System.out.println("Age of the employee: " + emp.getEmpAge());
		System.out.println("Designation of employee: " + emp.getEmpDesignation());
		System.out.println("Salary of the employee: " + emp.getEmpSalary());
		
	}

}


