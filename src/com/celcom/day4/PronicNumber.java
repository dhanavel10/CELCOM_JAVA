package com.celcom.day4;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		pronicNumber(number);
		

	}
	static void pronicNumber(int n) {
		
		for(int i=1;i<n;i++) {
			if((i*(i+1))==n) {
				System.out.println("yes.. it is a pronic numebr");
				return;
			}
		}
		System.out.println("Not a pronic number");
		
		
	}

}
