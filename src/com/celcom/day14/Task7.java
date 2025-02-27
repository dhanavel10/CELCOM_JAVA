package com.celcom.day14;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ECommerce{
	int orderId;
	Random rand= new Random();
	
	public ECommerce() {
		this.orderId=rand.nextInt(1000);
	}
	
	void placeOrder(int orderId) {
		System.out.println("Order placed for order id : "+orderId);
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

public class Task7 {

	public static void main(String[] args) {
		
		ExecutorService exe= Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++) {
			ECommerce e= new ECommerce();
			exe.execute(()->{
				e.placeOrder(e.orderId);
			});
		}
		exe.shutdown();
	}

}
