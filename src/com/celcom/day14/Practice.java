package com.celcom.day14;

interface Test{
	void show();
}

public class Practice implements Test {

	public static void main(String[] args) {
		
		Test t=()->{
			System.out.println("hello");
		};
		t.show();
		

	}

}
