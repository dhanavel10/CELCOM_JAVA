package com.celcom.day4;
class SuperClass
{
	void sample()
	{
		System.out.println("This is super class");
	}
}
class SubClass extends SuperClass
{
	void sample() {
		System.out.println("This is sub class");
	}
	
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		sub.sample();
	}

}
