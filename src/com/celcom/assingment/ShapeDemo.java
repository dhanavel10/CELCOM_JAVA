package com.celcom.assingment;

import java.util.Scanner;

class Shape{
	int length;
	int breadth;
	
	void calculateArea(int length,int breadth) {
		System.out.println("Calculate Area");
		
	}
}

class Rectangle extends Shape{
	
	//override
	
	void calculateArea(int length,int breadth) {
		int area=(length*breadth);
		System.out.println("Area of rectangle : "+(area));
	}
	
}

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle= new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		rectangle.calculateArea(sc.nextInt(), sc.nextInt());
	}

}
