package com.celcom.day5;

import java.util.Scanner;

interface Area {
	double calculateArea();
}

interface Perimeter {
	double calculatePerimeter();
}

abstract class Shape implements Area, Perimeter {
	int radius, length, breadth;
	float height;

	Shape(int radius) {
		this.radius = radius;
	}

	Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Shape(int length, float height) {
		this.length = length;
		this.height = height;
	}

}

class Circle extends Shape {

	Circle(int radius) {
		super(radius);

	}

	public double calculateArea() {
		double area = ((3.14) * radius * radius);
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = ((2 * 3.14 * radius));
		return perimeter;
	}

}

class Rectangle extends Shape {

	Rectangle(int length, int breadth) {
		super(length, breadth);

	}

	public double calculateArea() {
		int area = length * breadth;
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = 2 * (length + breadth);
		return perimeter;
	}

}

class Triangle extends Shape {

	Triangle(int length, float height) {
		super(length, height);
		// TODO Auto-generated constructor stub
	}

	public double calculateArea() {
		double area = ((0.5) * (length * height));
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = (length + height + height);
		return perimeter;
	}
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		Shape shape;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Circle 2.Rectangle 3.Triangle 4.exit");
			System.out.println("Enter choice :");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter radius");
				shape = new Circle(sc.nextInt());
				double area = shape.calculateArea();
				double perimeter = shape.calculatePerimeter();
				System.out.println("Area : " + area);
				System.out.println("Perimeter : " + perimeter);
			} else if (choice == 2) {
				System.out.println("Enter Length and Breadth");
				shape = new Rectangle(sc.nextInt(), sc.nextInt());
				double area = shape.calculateArea();
				double perimeter = shape.calculatePerimeter();
				System.out.println("Area : " + area);
				System.out.println("Perimeter : " + perimeter);

			} else if (choice == 3) {
				System.out.println("Enter Length and Height");
				shape = new Triangle(sc.nextInt(), sc.nextInt());
				double area = shape.calculateArea();
				double perimeter = shape.calculatePerimeter();
				System.out.println("Area : " + area);
				System.out.println("Perimeter : " + perimeter);
			} else {
				System.out.println("exit");
				break;
			}

		}

	}

}
