package com.programming.class1;

public class SwitchCase {
	public static void main(String[] args) {
		grading('A');
		grading('B');
		grading('C');
		grading('D');
	}

	static void grading(char grade) {
		int success = 0;
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("Excellent grade");
			success = 1;
			break;
		case 'C':
			System.out.println("Good grade");
			success = 1;
			break;
		case 'D':
		case 'E':
			System.out.println("Regive");
			success = -1;
			break;
		default:
			System.out.println("Unknown input");
			break;
		}
		passTheCourse(success);
	}

	static void passTheCourse(int success) {
		switch (success) {
		case 1:
			System.out.println("You passed the exam");
			break;
		case -1:
			System.out.println("You have to give the exam again");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

}
