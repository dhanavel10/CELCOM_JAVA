package com.celcom.day2;
class Employee{
	
	//variable
	int eid;
	String ename;
	double salary;
	
	
	//constructor
	Employee(int eid,String ename, double salary){
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	
	//method
	void display() {
		System.out.println("Employee id : "+eid);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee Salary : "+salary);
	}
}

public class ClassAndObject{

	public static void main(String[] args) {
		
		Employee obj = new Employee(1,"dhanavel",50000.0);
		obj.display();
		Employee obj1 = new Employee(2,"Dani",50000.0);
		obj1.display();
	}

}
