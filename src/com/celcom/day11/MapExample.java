package com.celcom.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map= new HashMap<>();
		
		map.put(1, "dani");
		map.put(2, "mani");
		map.put(3, "vel");
		map.put(null, null);
		
		for(Map.Entry<Integer, String> values:map.entrySet()) {
			System.out.println(values.getKey()+" "+values.getValue());
			
		}
		
		
		map.put(4, "Java");
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("Java"));
		
		
		
		Map<Integer,String> map2= new HashMap<>();
		map2.put(4, "hello");
		map2.put(5, "world");
		map2.put(6, "java ");
		
		map.putAll(map2);
		for(Map.Entry<Integer, String> values:map.entrySet()) {
			System.out.println(values.getKey()+" "+values.getValue());
			
		}
		
		map.putIfAbsent(7, "yess");
		
		
		map.merge(6, "hello", (oldValue,newValue)->oldValue+newValue);
		
		for(Map.Entry<Integer, String> values:map.entrySet()) {
			System.out.println(values.getKey()+" "+values.getValue());
			
		}
	}

}
