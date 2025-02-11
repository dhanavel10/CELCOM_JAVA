package com.celcom.day6;

public class TryCatchExample {

	public static void main(String[] args) {

		System.out.println("Before");

		try {
			int a = 10 / 0;
			
//			if(a%10==0) {
//				System.out.println();
//			}

		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("After");
	}

}
