package com.celcom.assingment;

class Animal{
	
	void makeSound() {
		System.out.println("Animal make sound");
	}
}

class Cat extends Animal{
	
	void makeSound() {
		System.out.println("Meow");
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		
		Animal cat = new Cat();
		
		cat.makeSound();

	}

}
