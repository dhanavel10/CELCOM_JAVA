package com.celcom.day9;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<Object> list= new Vector<>(3,2);
		System.out.println(list.capacity());
		System.out.println("=================");
		list.add(10);
		list.add("hi");
		list.add("dhanavel");
		list.add(10);
		System.out.println(list);
		list.remove((Integer)(10));
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("=================");
		if(list.contains("dhanavel"))
			System.out.println("YES");
		else
			System.out.println("NO");
		
		System.out.println("=================");
		
		
		if(list.isEmpty())
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
		System.out.println("=================");
		
		for(Object o:list) {
			System.out.println(o);
		}
		System.out.println("=================");
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("=================");
		
		Iterator <Object> i= list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("=================");
		
		Enumeration<Object> en= list.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
		System.out.println("=================");
		
		System.out.println(list.capacity());

	}

}
