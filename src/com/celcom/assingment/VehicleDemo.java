package com.celcom.assingment;

class Vehicle{
	
	void drive() {
		System.out.println("Super class");
	}
}

class Car extends Vehicle{
	
	void drive() {
		System.out.println("Repairing car");
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		
		Vehicle car = new Car();
		
		car.drive();

	}

}
