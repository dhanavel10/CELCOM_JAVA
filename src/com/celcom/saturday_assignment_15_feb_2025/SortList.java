package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("Before sorting : ");
		System.out.println(list);

		
		Collections.sort(list);
		
		System.out.println("After sorting : ");
		System.out.println(list);

	}

}
