package com.celcom.day2;

public class StaticAndInstanceMethod {
	
	void m1()
	{
		System.out.println("Instance Method");
	}
	static void m2()
	{
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		
		StaticAndInstanceMethod method = new StaticAndInstanceMethod();
		method.m1();
		
		StaticAndInstanceMethod.m2();
		
	}

}
