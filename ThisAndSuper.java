package com.programming.class3;

class Parent {
	int value = 10;

	void display() {
		System.out.println("Parent Method");
	}
}

public class ThisAndSuper extends Parent{
	int value = 20;
	@Override
	void display() {
		System.out.println("Child method");
	}

	void output() {
		System.out.println("local class: " + this.value);
		System.out.println("parent class: " + super.value);
		this.display();
		super.display();
	}
	public static void main(String[] args) {
		ThisAndSuper obj=new ThisAndSuper();
		obj.output();
	}

}
