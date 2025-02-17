package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListReversal {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();

		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter element : ");
			list.add(sc.nextInt());
		}
		System.out.println("Reversed list : ");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}

	}

}
