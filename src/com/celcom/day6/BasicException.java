package com.celcom.day6;

public class BasicException {

	public static void main(String[] args) {
		System.out.println("Before excpetion");
		
		try {
			
			int a=10/0;
		}
		catch(Exception e) {
			System.out.println("exception handling : " +e);
		}
		
		

		try {
			int arr[]= {1,2};
			System.out.println(arr[2]);
		}
		catch(Exception e) {
			System.out.println("exception handling : " +e);
		}
		
		// multiple catch block
		try {
			int a=Integer.parseInt("abc");
			
		}
		catch(NullPointerException e) {
			System.out.println("exception handling : " +e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handling : " +e);
		}
		catch(Exception e) {
			System.out.println("exception handling : " +e);
		}
		
		System.out.println("After exception");
	}

}
