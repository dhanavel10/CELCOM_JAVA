package com.celcom.day11;

import java.util.Scanner;

public class DecodingNumbers {

	public static void main(String[] args) {
		
		
		String temp = "";
		
		Scanner sc= new Scanner(System.in);
		
		String s= sc.next();
		int arr[]= new int[s.length()+1];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=1;i<s.length();i++) {
			
			temp+=s.charAt(i);
			
			temp=s.substring(i-1,i+1);
			int a=Integer.parseInt(temp);
			
			if(a<26) {
				if(a%10==0) {
					arr[i+1]=arr[i];
				}
				
			arr[i+1]=arr[i-1]+arr[i];
			
			}
			else {
				arr[i]=arr[i-1];
			}
		}
		System.out.println(arr[s.length()-1]);
//		for(int i=0;i<s.length();i++)
//			System.out.println(arr[i]);

	}

}
