package com.celcom.day7;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t= Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		t.setName("dhanavel");
		System.out.println(t.getName());
		System.out.println(t.isAlive());

	}

}
