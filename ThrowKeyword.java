package com.programming.class3;

public class ThrowKeyword {
	public static void main(String[] args) {
		sampleMethod();
		System.out.println("rest of code");
	}

	static void sampleMethod() {
		try {
			throw new NullPointerException("Null object");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
