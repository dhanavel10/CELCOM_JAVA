package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingExample 
{
	public static void main(String args[]) 
	{
		int arr[]= {1,6,2,4,9,3};
		
		Arrays.sort(arr);
		
		//Ascending order sorted array
		
		System.out.println("Sorted array :");
		
		for(int value:arr) 
		{
			System.out.println(value);
		}
		
		System.out.println("Minimum element : " +arr[0]);
		System.out.println("Second Minimum element : " +arr[1]);
		
		System.out.println("Maximum element : " +arr[arr.length-1]);
		System.out.println("Second Maximum element : " +arr[arr.length-2]);
		
		
		//Descending order sorted array
		System.out.println("Descending order :");
		
		for(int index=arr.length-1;index>=0;index--) 
		{
			System.out.println(arr[index]);
		}
	}
}
