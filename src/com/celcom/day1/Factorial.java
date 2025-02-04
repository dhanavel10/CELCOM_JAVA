package com.celcom.day1;

import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to find the Factorial");
		int number=sc.nextInt();
		int result=1;
		for(int index=1;index<=number;index++) {
			result*=index;
		
		}
		System.out.println("Factorial of the number :" +result);
	}
	
}
