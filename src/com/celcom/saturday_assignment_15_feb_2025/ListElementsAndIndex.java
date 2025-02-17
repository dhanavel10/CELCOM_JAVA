package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListElementsAndIndex {

	public static void main(String[] args) {
		
List <Integer> list = new ArrayList<>();
Scanner sc = new Scanner(System.in);
int size= sc.nextInt();
for(int i=0;i<size;i++) {
	System.out.println("Enter element : ");
	list.add(sc.nextInt());
}
		
		System.out.println("list Element and index : ");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println("List element : "+list.get(i)+"\t List Index : "+i);
		}

	}

}
