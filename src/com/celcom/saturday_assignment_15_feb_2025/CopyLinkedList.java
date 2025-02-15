package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CopyLinkedList {

	public static void main(String[] args) {
		List <Integer> list = new LinkedList<>();
		List <Integer> listCopy= new LinkedList<>();
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
		System.out.println("Copied LinkedList : ");
		System.out.println(listCopy);
		

	}

}
