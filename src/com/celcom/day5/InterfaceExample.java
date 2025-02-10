package com.celcom.day5;

interface VehiclePlan1{
	
	void noOfEngine();
	
}

interface VehiclePlan2{
	void noOfWheel();
	
	void brandName();
}
class CarBluePrint implements VehiclePlan1,VehiclePlan2{

	@Override
	public void noOfWheel() {
		System.out.println("4 wheels");
		
	}

	@Override
	public void brandName() {
		System.out.println("benz");
		
	}

	@Override
	public void noOfEngine() {
		System.out.println("1 engine");
		
	}

}

public class InterfaceExample {
	public static void main(String args[])
	{
		CarBluePrint c = new CarBluePrint();
		c.brandName();
	}
}
