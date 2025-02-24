package com.celcom.day11;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set <String> tree= new TreeSet<>();
		tree.add("Java");
		tree.add("programmer");
		tree.add("world");
		tree.add("hii");
		tree.add("-");
		try {
		tree.add(null);
		}
		catch(NullPointerException e) {
			System.out.println("Cannot insert null values in a treeset "+e);
		}
		
		System.out.println(tree);
		

		Set<String> hashset= new LinkedHashSet<>();
		hashset.add("java");
		hashset.add("programmer");
		hashset.add("world");
		hashset.add("hii");
		hashset.add("-");
		hashset.add(null);
		
		System.out.println(hashset);
	}

}
