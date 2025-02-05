package com.celcom.day2;


public class ArrayExample {
	public static void main(String args[]) {
		int arr[] = {10,20,30,40};
		int sum=0;
		System.out.println(arr.length);
		System.out.println("Array elements :");
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
			sum+=arr[index];
		}
		System.out.println("For each loop");
		for(int value:arr)
			System.out.println(value);
		System.out.println("Sum of array :" +sum);
	}
}
