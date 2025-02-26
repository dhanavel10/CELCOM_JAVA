package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task3 implements Runnable{

	
	public void run() {
		
		System.out.println("Task executed successfully..! " +Thread.currentThread());
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
public class Assignment2 {

	public static void main(String[] args) {
		
		ExecutorService execute=Executors.newFixedThreadPool(6);
		
		for(int i=0;i<10;i++) {
			execute.execute(new Task3());
		}

	}

}
