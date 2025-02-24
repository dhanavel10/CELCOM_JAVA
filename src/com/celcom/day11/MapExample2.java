package com.celcom.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample2 {

	public static void main(String[] args) {
		
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "dani");
		map.put(2, "mani");
		map.put(3, "vel");
		map.put(null, null);
		map.put(4, "hello");
		map.put(5, "world");
		map.put(6, "java ");
		
		map.putIfAbsent(6,"hiii !!");
		
		System.out.println(map.containsKey(3));
		
		System.out.println(map.containsValue("java"));
		
		System.out.println(map.keySet());
		
		System.out.println(map.get(4));
		
		System.out.println(map.remove(5));
		
		System.out.println(map.size());
		
		System.out.println(map.values());
		
		for(Entry<Integer, String> value:map.entrySet()) {
			System.out.println(value.getValue());
			
		}
		
		
	}

}
