package com.celcom.day3;


class DemoClass
{
	DemoClass(){
		this("vel");
		System.out.println("A");
	}
	DemoClass(String name){
		this(1);
		System.out.println("B");
	}
	DemoClass(int num){
		System.out.println("C");
		
	}
}
public class ConstructorExample2 {

	public static void main(String[] args) {
		DemoClass demo = new DemoClass();

	}

}
