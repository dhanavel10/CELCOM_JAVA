package com.celcom.day4;

public class MethodOverloading3 {

	void concatination(int number1, int number2) {
		System.out.println("Concatination of integer :" + number1 + number2);
	}

	void concatination(double number1, double number2) {
		System.out.println("Concatination of double :" + number1 + number2);
	}

	void concatination(String str1, String str2) {
		System.out.println("Concatination of String :" + str1 + str2);
	}

	public static void main(String[] args) {
		MethodOverloading3 concat = new MethodOverloading3();
		concat.concatination(2.44444, 46.33333);
		concat.concatination(5, 983);
		concat.concatination("hello", "world");

	}

}
