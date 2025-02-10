package com.celcom.saturday_assignment_08_feb_2025;

class Dog{
	String name;
	String breed;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	
	void setName(String name) {
		this.name= name;
		
	}
	void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("name : "+name);
		System.out.println("Breed : "+breed );
	}
}

public class DogDemo {

	public static void main(String[] args) {
		
		Dog dog = new Dog("tom","bulldog");
		
		dog.display();
		
		dog.setName("jerry");
		dog.setBreed("german shepherd");
		
		dog.display();
		

	}

}
