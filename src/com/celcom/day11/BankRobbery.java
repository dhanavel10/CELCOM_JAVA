package com.celcom.day11;

import java.util.ArrayList;
import java.util.Scanner;

public class BankRobbery {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Amount");
		int amount=sc.nextInt();
		
		System.out.println("Size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter element : ");
			arr[i]=sc.nextInt();
			
		}
		int c=0;
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=0;
			ArrayList<Integer> list= new ArrayList<>();
			for(int j=i;j<size;j++) {
				
				sum+=arr[j];
				list.add(arr[j]);
				
				
				if(sum==amount) {
					System.out.println(list);
					c=1;
				}
				
			}
			
		}
		if(c==0) {
			System.out.println("No sequence of amount is matched...!");
		}

	}

}
