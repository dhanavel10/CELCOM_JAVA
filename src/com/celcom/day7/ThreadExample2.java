package com.celcom.day7;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Running... "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {
		
		MyThread thread= new MyThread();
		MyThread thread1= new MyThread();
		
		
		thread.start();
		thread1.start();
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println(thread1.getState());
		System.out.println("Main end");
		
		

	}

}
