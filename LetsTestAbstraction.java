package com.programming.class1;

abstract class Shape {
	abstract void draw();

	double area;

	void calculateArea() {// optional to implement
		System.out.println("Area is " + area);
	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rectangle");
		double breadth = 20, height = 30;
		area = breadth * height;
		calculateArea();
	}

}

class Circle extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
		double radius=15;
		area=Math.PI*radius*radius;
		calculateArea();
	}

}

class Square extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing square");
		double side = 20;
		area = side * side;
		calculateArea();
	}

}



public class LetsTestAbstraction {
	public static void main(String[] args) {
		Rectangle rect =new Rectangle();
		rect.draw();
		
		Circle circ = new Circle();
		circ.draw();
		
		Square squ = new Square();
		squ.draw();
		
	}
}
