package com.programming.class1;

public class EmpData {

	int empId;
	String empName;
	int empAge;
	
	EmpData()
	{
		empId=99;
		empName="ABC";
		empAge=25;
	}
	EmpData(int empId){
		this.empId=empId;
		empName="ABC";
		empAge=25;
	}
	EmpData(String empName){
		this.empName=empName;
		empId=99;
		empAge=25;
	}
	EmpData(int empAge, int empId){
		empName="ABC";
		this.empId=empId;
		this.empAge=empAge;
	}
	EmpData(int empAge, int empId,String empName){
		this.empName=empName;
		this.empId=empId;
		this.empAge=empAge;
	}
	EmpData(int empId,String empName){
		this.empName=empName;
		this.empId=empId;
		empAge=25;
	}
	EmpData(String empName, int empAge){
		this.empName=empName;
		empId=99;
		this.empAge=empAge;
	}
	
	void display()
	{
		System.out.println("\nID: "+empId +" NAME: "+empName+" AGE: "+empAge);
	}
	public static void main(String[] args) {
		EmpData obj1 =new EmpData();
		obj1.display();
		
		EmpData obj2 =new EmpData(123);
		obj2.display();
		
		EmpData obj3 =new EmpData("DEF");
		obj3.display();
		
		EmpData obj4 =new EmpData(26, 100);
		obj4.display();
		
		EmpData obj5 =new EmpData(30,100,"DEF");
		obj5.display();
		
		EmpData obj6 =new EmpData(123, "DEF");
		obj6.display();
		
		EmpData obj7 =new EmpData("NAY", 20);
		obj7.display();
	}
}
