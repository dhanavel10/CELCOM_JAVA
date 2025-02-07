package com.celcom.day4;

class Demo{
	String msg=getMessage();
	
	String getMessage() {
		return "A";
	}
}

class Demo1 extends Demo{
	String getMessage() {
		return "B";
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d= new Demo1();
		System.out.println(d.msg);
		

	}

}
