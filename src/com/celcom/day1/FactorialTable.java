package com.celcom.day1;

import java.util.Scanner;
public class FactorialTable {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the factorial table");
		int number = sc.nextInt();
		int fact=1;
		for(int index=1;index<=number;index++) {
			fact=fact*index;
			System.out.println("Factorial of "+index+" is "+ fact);
		}
	}
}
