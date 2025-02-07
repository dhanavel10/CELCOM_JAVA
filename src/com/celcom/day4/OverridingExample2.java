package com.celcom.day4;

class Animal {
	int a=10;
	void display() {
		System.out.println("test");
	}
	void move() {
		System.out.println("Can not define");

	}

	void eat() {
		System.out.println("Can not define");
	}

}

class Cat extends Animal {
	int a=20;
	void move() {
		System.out.println("Will move by walk");
	}

	void eat() {
		System.out.println("Will eat rat");
	}
}

class Parrot extends Animal {
	void move() {
		System.out.println("Will move by fly");
	}

	void eat() {
		System.out.println("will eat grains");
	}
}

class Fish extends Animal {
	void move() {
		System.out.println("Will move by swim");
	}

	void eat() {
		System.out.println("will eat grains");
	}
}

public class OverridingExample2 {

	public static void main(String[] args) {

		Animal animal;
		animal=new Cat();
		animal.eat();
		animal=new Fish();
		animal.eat();
		animal.display();
		System.out.println(animal.a);
		

	}

}
