package com.celcom.saturday_assignment_15_feb_2025;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListIteration {

	public static void main(String[] args) {
List <Integer> list = new LinkedList<>();
Scanner sc = new Scanner(System.in);
int size= sc.nextInt();
for(int i=0;i<size;i++) {
	System.out.println("Enter element : ");
	list.add(sc.nextInt());
}
		
		System.out.println("Elements in linked list : ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}


	}

}
