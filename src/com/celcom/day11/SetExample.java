package com.celcom.day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Object> set = new HashSet<>();
		
		
		
		set.add("hello");
		set.add("world");
		set.add(1);
		set.add(false);
		System.out.println(set.hashCode());
		
		Set<Object> set1 = new HashSet<>();
		
		set1.add("hello");
		set1.add("Java");
		set1.add(null);
			set1.add(false);
		
		set.addAll(set1);
		System.out.println(set);
		
		System.out.println(set.retainAll(set1));
		
		System.out.println(set);
		
		System.out.println("======");
		
		if(set.containsAll(set1)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		System.out.println("======");
		
		
		Set <String> tree= new TreeSet<>();
		
		tree.add("vel");
		tree.add("helloo");
		
		//System.out.println(tree);
		Iterator<Object> iterator= set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("======");
		Object[] arr =set.toArray();
		System.out.println(arr[3]);
		
		
	}
	

}
