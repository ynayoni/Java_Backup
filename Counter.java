package com.programming.class2;

public class Counter {
	static int count;
	Counter(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Counter obj1 =new Counter();
		Counter obj2 =new Counter();
		Counter obj3 =new Counter();//non static 1 1 1 else static 1 2 3 
	}

}
