package com.programming.class1;

public class LoopConstructs {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println();
		for (i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		i = 1;
		do {
			System.out.println(i + " ");
			i++;
		} while (i <= 10);
		System.out.println();
		String[] strArr = { "Z", "A", "Z" };
		for (String str : strArr) {
			System.out.print(str + " ");
		}
	}
}
