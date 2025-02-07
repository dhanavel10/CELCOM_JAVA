package com.celcom.day4;

public class MethodOverloading {

	void demo(int number) {
		int fact = 1;
		for (int index = 1; index <= number; index++) {
			fact *= index;
		}
		System.out.println(fact);
	}

	void demo(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	String demo(String name) {
		//System.out.println("Welcome " + name);
		return name;
	}
//	void demo(String name) {
//		System.out.println("Welcome " + name);
//	}

	public static void main(String args[]) {

		MethodOverloading obj = new MethodOverloading();
		obj.demo(5);
		obj.demo("dhanavel");
		obj.demo(10, 20);
		System.out.println(obj.demo("hii"));

	}

}
