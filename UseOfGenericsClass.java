package com.programming.class3;

class GenericClass<T> {// entertain any type of data
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;

	}
}

public class UseOfGenericsClass {
	public static void main(String[] args) {
		GenericClass<Integer> gC = new GenericClass<Integer>();
		gC.add(123);
		System.out.println("Data is " + gC.get());

		GenericClass<String> gC2 = new GenericClass<String>();
		gC2.add("uahaz");
		System.out.println("Data is " + gC2.get());
	}

}
