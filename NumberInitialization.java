package com.programming.class1;

public class NumberInitialization {

	private int data;

	NumberInitialization() {
		data = 100;
	}

	public static void main(String[] args) {
		NumberInitialization obj = new NumberInitialization();
		System.out.println("Data: " + obj.data);
	}
}
