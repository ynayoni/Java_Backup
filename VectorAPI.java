package com.programming.class3;

import java.util.Vector;

public class VectorAPI {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<>(2,5);
		vec.addElement("z");
		vec.addElement("z");
		vec.addElement("z");
		System.out.println("Size: "+vec.size());
		System.out.println("Capacity: "+vec.capacity());
		
		vec.add("Z");
		vec.add("Z");
		vec.add("Z");
		vec.add("Z");
		vec.add("Z");
		
		System.out.println("Size: "+vec.size());
		System.out.println("Capacity: "+vec.capacity());

	}
}
