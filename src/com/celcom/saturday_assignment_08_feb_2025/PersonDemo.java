package com.celcom.saturday_assignment_08_feb_2025;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

public class PersonDemo {

	public static void main(String[] args) {
		
		Person person1 = new Person("vel",20);
		
		person1.display();
		Person person2=new Person("dani",21);
		
		person2.display();
	}

}
