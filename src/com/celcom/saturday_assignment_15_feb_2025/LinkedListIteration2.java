package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListIteration2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index value to get started ");
		int start = sc.nextInt();
		int size= sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter element : ");
			list.add(sc.nextInt());
		}
		if (start > list.size()) {
			System.out.println("Index out of bound");
			System.exit(start);
		}

		System.out.println("Elements in list : ");
		for (int i = start; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (int i = 0; i < start; i++) {
			System.out.println(list.get(i));
		}

	}

}
