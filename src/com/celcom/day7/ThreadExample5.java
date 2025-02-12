package com.celcom.day7;

class TwoTable extends Thread{
	
	public synchronized void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+" * 2 = "+(i*2));
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class FiveTable implements Runnable{
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.err.println(i+" * 5 = "+(i*5));
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread= new TwoTable();
		Thread thread2= new TwoTable();
		
		
		Thread thread1= new Thread(new FiveTable());
		
		thread.setPriority(10);
		
		thread.start();
		thread2.start();
		
		System.out.println("hi");
		
//		thread.join();
//		
//		thread1.start();
		
		
		//Thread main = Thread.currentThread();
		
		
//		try {
//			main.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		System.out.println(thread1.getState());
		for(int i=0;i<10;i++)
			System.out.println("=====");
		
		
		System.out.println("Main end ");
		

	}

}
