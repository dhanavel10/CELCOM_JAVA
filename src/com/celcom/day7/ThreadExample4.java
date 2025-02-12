package com.celcom.day7;

class MyNewThread implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Running... "+i);
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample4 {

	public static void main(String[] args) {
		Thread thread1= new Thread(new MyNewThread());
		Thread thread2= new Thread(new MyNewThread());
		Thread thread3= new Thread(new MyNewThread());
		
		//thread3.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		for(int i=0;i<10;i++) {
			System.out.println("main : "+i);
		}
		thread3.start();
		

	}

}
