package com.programming.class1;

public class BreakAndContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2)
					break;
				System.out.println(i + " " + j);
			}
		}
		System.out.println();
		ABC: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2)
					break ABC;// breaking outer loop
				System.out.println(i + " " + j);
			}
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2)
					continue;
				System.out.println(i + " " + j);
			}
		}
		System.out.println();
		ABC: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2)
					continue ABC;// breaking outer loop
				System.out.println(i + " " + j);
			}
		}

	}
}
