package com.celcom.day5;


interface Animal {
	void move();

	void eat();
	

}

class Cat implements Animal {
	int a=20;
	public void move() {
		System.out.println("Will move by walk");
	}

	public void eat() {
		System.out.println("Will eat rat");
	}
}

class Parrot implements Animal {
	public void move() {
		System.out.println("Will move by fly");
	}

	public void eat() {
		System.out.println("will eat grains");
	}
}

class Fish implements Animal {
	public void move() {
		System.out.println("Will move by swim");
	}

	public void eat() {
		System.out.println("will eat grains");
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {

		Animal animal;
		animal=new Cat();
		animal.eat();
		animal=new Fish();
		animal.eat();
		
		

	}

}
