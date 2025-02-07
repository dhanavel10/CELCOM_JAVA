package com.celcom.day4;

public class ConstructorOverloading {

	ConstructorOverloading(int number1, int number2) {
		this(2.333,4.555);
		System.out.println("Concatination of integer :" + number1 + number2);
	}

	ConstructorOverloading(double number1, double number2) {
		this("hello ","world");
		System.out.println("Concatination of double :" + number1 + number2);
	}

	ConstructorOverloading(String str1, String str2) {
		System.out.println("Concatination of String :" + str1 + str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj1 = new ConstructorOverloading(2, 3);
//		ConstructorOverloading obj2 = new ConstructorOverloading(2.8732, 7.386);
//		ConstructorOverloading obj3 = new ConstructorOverloading("hello", "world");

	}

}
