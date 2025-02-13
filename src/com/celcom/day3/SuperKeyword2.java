package com.celcom.day3;


class A{
	A(){
		super();
		System.out.println("A");
	}
	A(int a){
		System.out.println("A1");
	}
}

class B extends A {
	B(){
		this(10);   				// this is automatically invoked here
		System.out.println("B");
	}
	B(int q){
		super();   				// this is automatically invoked here
		System.out.println("B1");
	}
}
class C extends B {
	C(){
		//super()   				// this is automatically invoked here
		System.out.println("C");
	}
}
public class SuperKeyword2 {

	public static void main(String[] args) {
		
		B b= new B();

	}

}
