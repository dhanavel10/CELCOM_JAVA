package com.celcom.day12;

class Example<K>{
	
	private K val1;
	private K val2;
	
	public K getVal1() {
		return val1;
	}
	public void setVal1(K val1) {
		this.val1 = val1;
	}
	public K getVal2() {
		return val2;
	}
	public void setVal2(K val2) {
		this.val2 = val2;
	}
	
}


public class GenericsExample {

	public static void main(String[] args) {
		
		Example<Object> ex= new Example<Object>();
		ex.setVal1(10);
		ex.setVal2("hello");
		System.out.println(ex.getVal1());
		System.out.println(ex.getVal2());
		
		Example<Double> ex1= new Example<Double>();
		
		ex1.setVal2(1.22);
		System.out.println(ex1.getVal2());
		
		

	}

}
