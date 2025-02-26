package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task2 implements Runnable{

	
	public void run() {
		
		System.out.println("Task executed");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
public class Assignment3 {

	public static void main(String[] args) {
		
		ExecutorService execute=Executors.newCachedThreadPool();
		
		for(int i=0;i<10;i++) {
			execute.execute(new Task2());
		}

	}

}
