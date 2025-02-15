package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;

public class ListElementsAndIndex {

	public static void main(String[] args) {
		
List <Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("list Element and index : ");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println("List element : "+list.get(i)+"\t List Index : "+i);
		}

	}

}
