package com.celcom.day4;

public class MethodOverloading2 {
	
	void addition(int a,int b) {
		System.out.println("int addition :"+(a+b));
	}
	
	void addition(double a,double b) {
		System.out.println("double addition "+(a+b));
	}
	
	void addition(long a,long b) {
		System.out.println("long addition "+(a+b));
	}

	public static void main(String[] args) {
		MethodOverloading2 add= new MethodOverloading2();
		add.addition(10, 20);
		add.addition(2.788, 7.73475374);
		add.addition(7364872, 3849324);

	}

}
