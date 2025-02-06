package com.celcom.day3;


class Bike
{
	String brand;
	String model;
	int topSpeed;
	String color;
	int price;
	 
	Bike(String brand,String model,int topSpeed, String color,int price )
	{
		this.brand=brand;
		this.model=model;
		this.topSpeed=topSpeed;
		this.color=color;
		this.price=price;
		//System.out.println(price);
		
	}
	void display()
	{
		System.out.println("This is a "+brand+" model "+model +" top speed "+topSpeed+" and color "+color+ " price "+ price);
	}
}
public class ClassAndObjectForBike{
	

	public static void main(String[] args) {
		
		Bike honda= new Bike("Honda","shine",85,"black",95000);
		honda.display();
	}

}
