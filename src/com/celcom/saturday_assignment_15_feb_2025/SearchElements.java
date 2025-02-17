package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElements {

	public static void main(String[] args) {
		
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements : ");
		int search= sc.nextInt();
		List <Integer> list = new ArrayList<>();
		
		int size= sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter element : ");
			list.add(sc.nextInt());
		}
		for(int value:list)
		{
			if(value==search) {
				System.out.println("Found");
				c=1;
				break;
			}
		}
		if(c==0)
			System.err.println("Not Found");
		
	}

}
