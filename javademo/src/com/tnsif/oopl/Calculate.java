package com.tnsif.oopl;

abstract class Shape{
	int area;
	
	abstract void calArea();
	
	public void show() {
		System.out.println("Area : " + area);
	}
}

class Square extends Shape{
	int side;
	
	Square(int s){
		side = s;
	}
	
	public void calArea() {
		area = side * side;
	}
}

class Rectangle extends Shape{
	int length, breadth;
	
	Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
	
	public void calArea() {
		area = length * breadth;
	}
}

public class Calculate {

	public static void main(String[] args) {
		Square s = new Square(4);
		Rectangle r = new Rectangle(3,4);
		
		s.calArea();
		s.show();
		
		r.calArea();
		r.show();

	}

}
