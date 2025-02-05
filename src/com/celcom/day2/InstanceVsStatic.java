package com.celcom.day2;

public class InstanceVsStatic {
	int a=10;
	
	static int b=100;
	
	public static void main(String[] args) {
		InstanceVsStatic obj1= new InstanceVsStatic();
		InstanceVsStatic obj2= new InstanceVsStatic();
		
		
		System.out.println("Before changing Instance:");
		System.out.println(obj1.a); 
		System.out.println(obj2.a);
		obj1.a=20;
		
		System.out.println("After changing Instance:");
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		
		obj1.b=200;
		
		System.out.println("After changing Static:");
		System.out.println(obj1.b); 
		System.out.println(obj2.b);
		
		
		
		

	}

}
