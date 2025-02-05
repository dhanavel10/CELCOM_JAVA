package com.celcom.day2;

public class Variables {
	int instanceVariable=20;
	static int variable=10;

	public static void main(String[] args) {
		
		int localVariable=30;
		Variables var =new Variables();
		
		//Instance variable
		System.out.println(var.instanceVariable);
		
		//Static variable
		System.out.println(Variables.variable);
		
		//Local variable
		System.out.println(localVariable);
	}

}
