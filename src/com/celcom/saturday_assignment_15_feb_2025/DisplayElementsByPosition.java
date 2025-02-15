package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;

public class DisplayElementsByPosition {

	public static void main(String[] args) {
List <Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("Elements in list : ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}
