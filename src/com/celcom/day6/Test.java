package com.celcom.day6;

abstract class Demo{
	abstract void show();
	
}
class MyClass extends Demo{
	void show() {
		System.out.println("hi");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d= new MyClass();
		d.show();

	}

}
