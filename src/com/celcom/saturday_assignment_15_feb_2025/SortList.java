package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int size= sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter element : ");
			list.add(sc.nextInt());
		}
		
		System.out.println("Before sorting : ");
		System.out.println(list);

		
		Collections.sort(list);
		
		System.out.println("After sorting : ");
		System.out.println(list);

	}

}
