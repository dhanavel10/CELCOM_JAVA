package com.celcom.day13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable{

	@Override
	public Integer call() throws Exception {
		int sum=0;
		System.out.println(Thread.currentThread());
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		return sum;
		
	}
	
}

public class Assignment5 {

	public static void main(String[] args) {
		
		Future result;
		
		ExecutorService execute=Executors.newFixedThreadPool(3);
		
		result=execute.submit(new Task());
		try {
			Thread.currentThread().sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread());
		
		
		try {
			System.out.println(result.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("Data not available");		
			e.printStackTrace();
		}
	}

}
