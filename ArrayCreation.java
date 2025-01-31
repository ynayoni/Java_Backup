package com.programming.class2;

public class ArrayCreation {
	public static void main(String[] args) {
		int[] intArr = new int[5];

		intArr[0] = 10;
		intArr[3] = 5;
		intArr[2] = 670;
		intArr[1] = 90;
		intArr[4] = 100;

		for (int i = 0; i < intArr.length; i++)
			System.out.println(intArr[i]);
		System.out.println();
		String[] strArr = { "Z", "X", "A" };
		for (String str : strArr)
			System.out.println(str);
		System.out.println();
		char[] charArr = { 'a', 'b', 'c' };
		for (char ch : charArr)
			System.out.println(ch);
		System.out.println();
		boolean[] arr = { false, true, false, true };
		for (boolean b : arr)
			System.out.println(b);

		int min = intArr[0];
		for (int i = 1; i < intArr.length; i++) {
			if (intArr[i] < min)
				min = intArr[i];
		}
		System.out.println("\nMin: " + min);

	}

}
