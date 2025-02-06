package com.celcom.day3;

import java.util.Scanner;

class Shape {
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

	double calculateArea() {
		return 0.0;
	}
}

class Circle extends Shape {

	Circle(int radius) {
		super(radius);

	}

	double calculateArea() {
		double area = ((3.14) * radius * radius);
		return area;
	}

}

class Rectangle extends Shape {

	Rectangle(int length, int breadth) {
		super(length, breadth);

	}

	double calculateArea() {
		int area = length * breadth;
		return area;
	}

}

class Triangle extends Shape {

	Triangle(int length, float height) {
		super(length, height);
		// TODO Auto-generated constructor stub
	}

	double calculateArea() {
		double area = ((0.5) * (length * height));
		return area;
	}
}

public class Assingment1 {

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
				System.out.println(area);
			} else if (choice == 2) {
				System.out.println("Enter Length and Breadth");
				shape = new Rectangle(sc.nextInt(), sc.nextInt());
				double area = shape.calculateArea();
				System.out.println(area);

			} else if (choice == 3) {
				System.out.println("Enter Length and Height");
				shape = new Triangle(sc.nextInt(), sc.nextInt());
				double area = shape.calculateArea();
				System.out.println(area);
			} else {
				System.out.println("exit");
				break;
			}

		}

	}

}
