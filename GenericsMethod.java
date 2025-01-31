package com.programming.class3;

public class GenericsMethod {
	public static void main(String[] args) {
		Integer[] intArr = { 1, 2, 3, 4, 5 };
		Character[] charArr = { 'a', 'b', 'c' };

		System.out.println("Printing int arr");
		printArr(intArr);

		System.out.println("Printing char arr");
		printArr(charArr);
	}

	static <E> void printArr(E[] elements) {
		for (E ele : elements) {
			System.out.println(ele + " ");
		}
		System.out.println();
	}

}
