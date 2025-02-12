package com.celcom.day7;

class MyThread implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Running... "+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		
		Thread thread1= new Thread(new MyThread());
		Thread thread= new Thread(new MyThread());
		
		thread.start();
		synchronized(thread1) {
			thread1.wait(1000);
		}
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		thread1.start();
		

		
		System.out.println(thread.getState());
		System.out.println("Main end");

	}

}
