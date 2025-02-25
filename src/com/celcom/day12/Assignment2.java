package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GenericsList<T>{
	List <T> array1= new ArrayList<>();
	List <T> array2= new ArrayList<>();
	List <T> result= new ArrayList<>();
	
	boolean checkList(int size) {
		for(int i=0;i<size;i++) {
			
			if(!array1.get(i).equals(array2.get(i))) {
				return false;
			}
		}
		return true;
		
		
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		
GenericsList <String> g= new GenericsList();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("enter elements for array 1 : ");
			g.array1.add(sc.next());
		}
		
		for(int i=0;i<size;i++) {
			System.out.println("enter elements for array 2 : ");
			g.array2.add(sc.next());
		}
		
		if(g.checkList(size)) {
			System.out.println("Same elements !");
		}
		else {
			System.out.println("Element mismatch !");
		}
		
	}

}
