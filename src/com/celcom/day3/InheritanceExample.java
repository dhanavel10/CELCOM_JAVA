package com.celcom.day3;

class Vehicle
{
	
	void noOfEnginete() {
		System.out.println("One Engine");
	}
	
}
class TwoWheeler extends Vehicle{
	void noOfWheel() {
		System.out.println("Two wheel");
	}
	
}

class NewBike extends TwoWheeler{
	void brandName() {
		System.out.println("Honda");
	}
}

class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("Vespa");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		
		NewBike bike = new NewBike();
		bike.noOfEnginete();
		bike.noOfWheel();
		bike.brandName();
		
		System.out.println("===============");
		
		Scooty vespa= new Scooty();
		vespa.noOfEnginete();
		vespa.noOfWheel();
		vespa.brandName();
		

	}

}
