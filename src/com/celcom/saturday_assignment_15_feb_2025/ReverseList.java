package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("Reversed list : ");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}
	}

}
