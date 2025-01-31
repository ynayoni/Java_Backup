package com.programming.class3;

import java.io.IOException;

public class ExceptionPropagation {
	public static void main(String[] args) throws IOException {
		a();
	}
	static void a() throws IOException {
		b();
	}
	static void b() throws IOException {
		c();
	}
	static void c()throws IOException {
		throw new IOException("Device error");
	}
}
