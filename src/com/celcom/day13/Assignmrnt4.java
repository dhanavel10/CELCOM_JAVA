package com.celcom.day13;
import java.time.LocalTime;
import java. util. Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable{
	Calendar calendar = Calendar. getInstance();
	

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread()+" Current time : "+LocalTime.now());
//		try {
//			Thread.currentThread().sleep(1500);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
	}
	
	
	
}

public class Assignmrnt4 {

	public static void main(String[] args) {
		
		ScheduledExecutorService execute= Executors.newScheduledThreadPool(3);
		
		for(int i=1;i<=10;i++) {
			execute.schedule(new Task1(), 1500*i, TimeUnit.MILLISECONDS);
		}
		

	}

}
