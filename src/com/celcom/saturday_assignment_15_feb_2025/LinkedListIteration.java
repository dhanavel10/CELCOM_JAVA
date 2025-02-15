package com.celcom.saturday_assignment_15_feb_2025;


import java.util.LinkedList;
import java.util.List;

public class LinkedListIteration {

	public static void main(String[] args) {
List <Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("Elements in linked list : ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}


	}

}
