package com.celcom.day7;

class Resource1 {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}

class Reader extends Thread {

	Resource1 resource;

	Reader(Resource1 resource) {
		this.resource = resource;
	}

	public void run() {
		synchronized (resource) {
			System.out.println("Reader is waiting for writer");
		
		try {
			resource.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(resource.getData());
		}
		

	}

}

class Writer extends Thread {
	Resource1 resource;

	Writer(Resource1 resource) {
		this.resource = resource;
	}
	
	public void run() {
		synchronized(resource) {
			System.out.println("writer is writing the data");
			resource.setData("hello reader");
			resource.notify();
		}
	}

}

public class ThreadExample6 {

	public static void main(String args[]) throws InterruptedException {
		
		Resource1 resource= new Resource1();
		
		Reader read= new Reader(resource);
		read.start();
		
		Thread.sleep(1000);
		
		Writer write = new Writer(resource);
		
		write.start();
		

	}
}
