package com.celcom.day14;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Task8 {
	
	static String s=null;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//s=sc.next();
		ScheduledExecutorService scheduler =  Executors.newScheduledThreadPool(1);
		
		
		scheduler.scheduleWithFixedDelay(()->{
			if(s==null) {
				System.out.println("user inactive");
			}
			else {
				System.out.println("active");
			}
		}, 5000, 1000, TimeUnit.MILLISECONDS);
		s=sc.next();
		
		//scheduler.shutdown();
}
}
