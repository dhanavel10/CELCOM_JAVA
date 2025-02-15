package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;

public class CopyList {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		List <Integer> listCopy= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		for(int value:list)
		{
			listCopy.add(value);
		}
		System.out.println("Copied list : ");
		System.out.println(listCopy);
		
	}

}
