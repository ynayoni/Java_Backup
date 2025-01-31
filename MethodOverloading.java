package com.programming.class2;

public class MethodOverloading {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(MethodOverloading.add(12, 13));
		System.out.println(MethodOverloading.add(12.2, 13.3));
		System.out.println(MethodOverloading.add(12, 13, 14));

	}

}
