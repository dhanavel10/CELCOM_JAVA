package com.celcom.day3;

class Vehicle1{
	String type;
	
	Vehicle1(String type){
		this.type=type;
		System.out.println("Super class");
	}
	
	void noOfEngine() {
		System.out.println("One Engine");
	}
	
}
class TwoWheeler1 extends Vehicle1{
	String brandName;
	
	TwoWheeler1(){
		super("Honda");
	}
	void noOfWheels() {
		System.out.println("Two Wheels");
		super.noOfEngine();
		System.out.print(super.type);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		TwoWheeler1 honda= new TwoWheeler1();
		honda.noOfWheels();
	}

}
