package com.celcom.day2;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String args[]) {
		int arr[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Initial value of array :");
		int sum=0;
		int evenCount=0;
		int oddCount=0;
		
		for(int value:arr) {
			System.out.println(value);
		}
		
		for(int index=0;index<arr.length;index++) {
			System.out.println("Enter array element of "+(index+1) +"th element ");
			int temp= sc.nextInt();
			arr[index]=temp;
		}
		for(int value:arr) {
			sum+=value;
			if(value%2==0) {
				evenCount+=1;
			}
			else {
				oddCount+=1;
			}
		}
		
		System.out.println("Array for assigning value :");
		for(int value:arr) {
			System.out.println(value);
		}
		
		
		System.out.println("Sum is :"+sum);
		System.out.println("Even Count is :"+evenCount);
		System.out.println("Even Count is :"+oddCount);
		
	}
}
