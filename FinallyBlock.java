package com.programming.class3;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Returned value: "+sampleMethod());
		
	}
	static int sampleMethod() {
		try {
			return 112;
			
		}finally {//runs first
			System.out.println("Finally block runs for sure ");
		}
	}

}
