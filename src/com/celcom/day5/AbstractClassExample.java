package com.celcom.day5;

abstract class Vehicle{
	int number;
	Vehicle() {
		System.out.println("Constructor");
	}
	
	static void noOfEngine() {
		System.out.println("One engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
	
	
}
class Car extends Vehicle{

	Car(){
		super();
	}
	
	void noOfWheels() {
		System.out.println("four wheels");
	
	}

	void brandName() {
		System.out.println("benz");
		super.noOfEngine();
		System.out.println(super.number);
		
	}
	
}

public class AbstractClassExample {

	public static void main(String[] args) {
		
		//Vehicle.noOfEngine();
		Vehicle car = new Car();
		car.brandName();
		car.noOfWheels();
		

	}

}
