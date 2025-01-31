package com.programming.class3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToArrayList {
	private static final String Iterator = null;

	public static void main(String[] args) {
		Integer[] intArr= {1,2,3,4};
		List<Integer> listInt=new ArrayList<>(Arrays.asList(intArr));
		listInt.add(5); listInt.add(6);
		
		Iterator<Integer> itr=listInt.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i);
		}
		}

}
