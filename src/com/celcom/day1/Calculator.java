package com.celcom.day1;

import java.util.Scanner;
public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean c=true;
		while(c) {
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
		System.out.println("Enter choice");
		
		int number= sc.nextInt();
		if(number==5)
			return;
		System.out.println("Enter two numbers");
		int number1= sc.nextInt();
		int number2=sc.nextInt();
		switch(number){
			case 1:
				System.out.println("Addition : "+(number1+number2));
				break;
			case 2:
				System.out.println("Subtraction"+(number1-number2));
				break;
			case 3:
				System.out.println("Multiplication :"+ (number1*number2));
				break;
			case 4:
				System.out.println("Division : "+ (number1/number2));
				break;
			case 5:
				c=false;
				break;
			default:
				System.out.println("Enter proper number");

		}
		
		
		}
	
}
}