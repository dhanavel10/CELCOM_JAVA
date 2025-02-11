package com.celcom.day6;

public class FinallyExample {

	public static void main(String[] args) {
		
		
		try {
			int a=10/0;
			
		}
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		finally {
			
			System.out.println("Finally block");
		}

	}

}
