package com.celcom.day7;

public class ThreadUsingAnonymousInnerClass {

	public static void main(String[] args) {
		
		Runnable runnable= new Runnable() {

			@Override
			public void run() {
				
				for(int i=1;i<=10;i++) {
					//System.out.println("Thread1 is running...");
					System.out.println(i+" * 5 = "+(i*5));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		Thread thread= new Thread(runnable);
		thread.start();
		
		Runnable runnable1=()->{
			for(int i=1;i<11;i++) {
				//System.out.println("Thread2 is running...");
				System.out.println(i+" * 2 = "+(i*2));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread2= new Thread(runnable1);
		thread2.start();

	}

}
