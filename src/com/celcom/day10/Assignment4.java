package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		
		List <Integer> list1= new ArrayList<>();
		List <Integer> list2= new ArrayList<>();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size for list1");
		int num1=sc.nextInt();
		System.out.println("Enter size for list2");
		int num2=sc.nextInt();
		
		for(int i=0;i<num1;i++) {
			System.out.println("Enter element for list1");
			list1.add(sc.nextInt());
		}
		
		for(int i=0;i<num2;i++) {
			System.out.println("Enter element for list 2");
			list2.add(sc.nextInt());
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.equals(list2));
	}

}
