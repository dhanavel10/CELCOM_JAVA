package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		List <Integer> list= new ArrayList<>();
		
		System.out.println("Enter length");
		Scanner sc= new Scanner(System.in);
		
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element : ");
			list.add(sc.nextInt());
		}
		
		List <Integer> list1= new LinkedList<>(list);
		System.out.println(list1);
		

	}

}
