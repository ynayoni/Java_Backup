package com.programming.class1;

public class Duration {
	long startValue, endValue;
	Duration(long startValue, long endValue){
		if(startValue>endValue) {
			throw new IllegalArgumentException("Start cannot be greater than end");
		}
		this.startValue=startValue;
		this.endValue=endValue;
	}
	public static void main(String[] args) {
		Duration obj=new Duration(21,23);
		System.out.println("Start: "+obj.startValue);
		System.out.println("End is "+obj.endValue);
	}
}
