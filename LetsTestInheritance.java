package com.programming.class1;

public class LetsTestInheritance extends Parent {

	int data = 20;

	@Override
	void display() {
		System.out.println("Child class method");
		System.out.println("Value of data is " + data);
	}

	void message() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {

		Parent obj = new Parent();
		System.out.println("Data is " + obj.data);
		obj.display();

		LetsTestInheritance obj2 = new LetsTestInheritance();
		System.out.println("Data is: " + obj2.data);
		obj2.display();

		Parent obj3 = new LetsTestInheritance();
		System.out.println("Data is : " + obj3.data);
		obj3.display();//overriding 
	}

}

class Parent {
	int data = 10;

	void display() {
		System.out.println("Parent class method");
		System.out.println("Value of data is " + data);
	}

	void show() {
		System.out.println("Parent class method");
	}
}
