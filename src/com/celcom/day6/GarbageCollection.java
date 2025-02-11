package com.celcom.day6;

public class GarbageCollection {
	
	static int count=0;
	GarbageCollection(){
		count++;
		System.out.println(count);
	}
	
	protected void finalize() {
		count--;
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		GarbageCollection obj1= new GarbageCollection();
		GarbageCollection obj2= new GarbageCollection();
		System.gc();
		Runtime.getRuntime().gc();
		
	}

}
