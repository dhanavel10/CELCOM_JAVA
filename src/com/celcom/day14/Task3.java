package com.celcom.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Sort implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o2.getValue() - o1.getValue();
	}

}

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> task = new HashMap<>();
		task.put("email", 10);
		task.put("outlook", 20);
		task.put("teams", 1);

//			System.out.println("Enter the choice to enter application : ");
//			System.out.println("1.Email");
//			System.out.println("2.Outlook");
//			System.out.println("3.Teams");
//			int c = 0;
//			int choice = sc.nextInt();
//
//			switch (choice) {
//
//			case 1:
//				task.put("email", task.get("email") + 1);
//				break;
//
//			case 2:
//				task.put("outlook", task.get("outlook") + 1);
//				break;
//
//			case 3:
//				task.put("teams", task.get("teams") + 1);
//				break;
//			}
//		
	
		List<Map.Entry<String, Integer>> set = new ArrayList<>(task.entrySet());
		Collections.sort(set, new Sort());
		for (Map.Entry<String, Integer> val : set) {
			System.out.println(val.getKey() + " " + val.getValue());
		}
}
}
