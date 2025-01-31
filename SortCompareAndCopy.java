package com.programming.class2;

import java.util.Arrays;

public class SortCompareAndCopy {
	public static void main(String[] args) {
		int[] intArr = {10,9,84,5,6,2,3,5,6};
		Arrays.sort(intArr);
		System.out.println("Sorted Arrays: "+Arrays.toString(intArr));
		
		boolean[] blnArr1= {true,false};
		boolean[] blnArr2= {true,false};
		System.out.println("Arrays comparison result: "+ Arrays.equals(blnArr1, blnArr2));
		
		int[] intArr2=new int[3];
		System.arraycopy(intArr, 0, intArr2, 0, 3);
		
		System.out.println(Arrays.toString(intArr2));
	}

}
