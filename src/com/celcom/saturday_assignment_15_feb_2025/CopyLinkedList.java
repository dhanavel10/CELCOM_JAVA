package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CopyLinkedList {

	public static void main(String[] args) {
		List <Integer> list = new LinkedList<>();
		List <Integer> listCopy= new LinkedList<>();
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
		System.out.println("Copied LinkedList : ");
		System.out.println(listCopy);
		

	}

}
