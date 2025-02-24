package com.celcom.day11;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer,String> map= new TreeMap<>();
		map.put(1, "dani");
		map.put(2, "mani");
		map.put(3, "vel");
		
		map.put(4, "hello");
		map.put(5, null);
		map.put(6,  null);
		
		try {
			map.put(null, null);
		}
		catch(Exception e) {
			System.out.println("tree map cannot have null key... " +e);
		}
		
		//map.putIfAbsent(6,"hiii !!");
		
		System.out.println(map.containsKey(3));
		
		System.out.println(map.containsValue("java"));
		
		System.out.println(map.keySet());
		
		System.out.println(map.get(4));
		
		System.out.println(map.remove(2));
		
		System.out.println(map.size());
		
		System.out.println(map.values());
		
		System.out.println("==========");
		
		for(Entry<Integer, String> value:map.entrySet()) {
			System.out.println(value.getValue());
			
		}
		System.out.println("==========");
		for(String s:map.values()) {
			System.out.println(s);
		}
		
		

	}

}
