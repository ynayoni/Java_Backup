package com.programming.class3;

import java.util.ArrayList;
import java.util.List;

public class UseOfGenerics {
	public static void main(String[] args) {
		List<String> listOfStr = new ArrayList<>();
		listOfStr.add("Z");
		listOfStr.add("Z");
		listOfStr.add("Z");
		listOfStr.add("Z");

		for (int i = 0; i < listOfStr.size(); i++) {
			System.out.println(listOfStr.get(i) + " ");
		}

		System.out.println();
		List listOfStr2 = new ArrayList();
		listOfStr2.add("Z");
		listOfStr2.add(true);
		listOfStr2.add(1);
		listOfStr2.add('v');

		for (int i = 0; i < listOfStr2.size(); i++) {
			System.out.println(listOfStr2.get(i) + " ");
		}
		System.out.println();
		List<Integer> listOfInt = new ArrayList<>();
		listOfInt.add(1);
		listOfInt.add(2);
		listOfInt.add(3);
		listOfInt.add(4);

		for (int i = 0; i < listOfInt.size(); i++) {
			System.out.println(listOfInt.get(i) + " ");
		}
	}

}
