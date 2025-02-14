package com.celcom.day9;

public class WrapperClassExample {
	public static void main(String[] args) {
	int a=10;
	Integer obj= new Integer(a);   //Boxing
	Integer obj2=10;  //Autoboxing
	int b=obj.intValue();		   //Un-boxing
	int c=obj2;  //Auto unboxing
	System.out.println(obj+b);
	
	}
}
