package com.celcom.day14;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Task2 {

	public static void main(String args[]) {
		
		BlockingQueue<String> a = new LinkedBlockingQueue<>(5);
		Scanner sc= new Scanner(System.in);
		String items = null;
		while(true) {
			
			items=sc.next();
			if(items.equals("-1")) {
				break;
			}
			if(a.size()==5 && !a.contains(items)) {
				try {
					a.poll();
					a.put(items);
					System.out.println("removed and Added");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if(!a.contains(items)) {
				try {
					a.put(items);
					System.out.println("Added");
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				
			}
			System.out.println(a.toString());
			
		}
	}
}
