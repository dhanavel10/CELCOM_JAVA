package com.celcom.day4;

class Vehicle {

	void engine() {
		System.out.println("All vehicle has a engine");
	}

	void wheel() {
		System.out.println("All vehicle has wheels");
	}

}

class Wheels {

	void wheelModel() {
		System.out.println("Wheel brand is MRF");

	}

	void noOfWheels(String vehicletype) {

		if (vehicletype.equals("Two wheeler")) {
			System.out.println("2 wheels");
		} else if (vehicletype.equals("four wheeler")) {
			System.out.println("4 wheels");

		}
	}
}

class Engine {

	void engineModel() {
		System.out.println("Engine model is V8");

	}

}

class Car extends Vehicle {
	Wheels wheel = new Wheels();
	Engine engine = new Engine();
	
	void engineModel() {
		engine.engineModel();
	}
	void noOfWheels() {
		wheel.noOfWheels("four wheeler");
	}
	void wheelModel() {
		wheel.wheelModel();
	}
}

public class IsAHasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.engine();
		car.engineModel();
		car.noOfWheels();
		car.wheelModel();
		car.wheel();

	}

}
