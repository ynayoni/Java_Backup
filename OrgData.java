package com.programming.class2;

public class OrgData {
	int empId;
	String empName;
	int empAge;

	static String orgAddress;

	OrgData(int empId, String empName, int empAge) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	static {
		orgAddress = "ABC OFFICE, XYZ CITY, PQR-537928";
	}

	void display() {
		System.out.println("ID: " + empId + "NAME: " + empName + " AGE: " + empAge + " ADDRESS: " + orgAddress);
	}

	static void orgNameChange() {
		orgAddress = "ABC NXXDNSUD OSOA28290";
	}

	public static void main(String[] args) {
		OrgData.orgNameChange();
		System.out.println("Org address is " + orgAddress);
		
		OrgData o1=new OrgData(123,"A",25);
		o1.display();
		OrgData o2=new OrgData(124,"P",26);
		o2.display();
		OrgData o3=new OrgData(125,"U",27);
		o3.display();
	}

}
