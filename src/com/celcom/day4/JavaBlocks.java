package com.celcom.day4;

public class JavaBlocks {
	//constructor
	JavaBlocks(){
		System.out.println("Constructor");
	}
	
	//Instance block
	{
		System.out.println("Instance block");
	}
	
	
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		
		System.out.println("main block");
		
		//Object
		JavaBlocks block = new JavaBlocks();
		
	}

}
