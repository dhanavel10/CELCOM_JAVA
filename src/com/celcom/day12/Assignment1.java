package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Generics<T>
{
	List <T> array1= new ArrayList<>();
	List <T> array2= new ArrayList<>();
	List <T> result= new ArrayList<>();
	
	void merge(int size) {
		for(int i=0;i<size;i++) {
			result.add(array1.get(i));
			result.add(array2.get(i));
		}
		
		System.out.println("Merged array : ");
		for(int i=0;(i<size*2);i++) {
			System.out.print(result.get(i)+" ");
		}
	}
	
	
}

public class Assignment1 {

	public static void main(String[] args) {
		
		Generics <String> g= new Generics();
		
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
		
		g.merge(size);
		

	}

}
