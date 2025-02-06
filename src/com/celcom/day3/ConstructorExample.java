package com.celcom.day3;

class Demo
{
	String name;
	Demo()
	{
		this("vel");
	}
	
	Demo(String name){
		this.name=name;
		this.display();
		
	}
	
	void display()
	{
		System.out.println("helloo "+name);
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		Demo d= new Demo();

	}

}
