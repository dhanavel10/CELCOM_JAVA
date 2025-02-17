package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyList {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		List <Integer> listCopy= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter element : ");
			list.add(sc.nextInt());
		}
		for(int value:list)
		{
			listCopy.add(value);
		}
		System.out.println("Copied list : ");
		System.out.println(listCopy);
		
	}

}
