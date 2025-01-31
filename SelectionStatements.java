package com.programming.class1;

public class SelectionStatements {

	public static void main(String[] args) {
		int number = 13;
		if (number % 2 == 0)
			System.out.println(number + " is Even");
		else
			System.out.println(number + " is Odd");

		int marks = 85;
		if (marks < 80)
			System.out.println(marks + " marks falls under good");
		else if (marks >= 80 && marks < 90)
			System.out.println(marks + " marks falls under very good");
		else
			System.out.println(marks + " marks falls under excellent");
	}

}