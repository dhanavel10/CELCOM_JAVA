package com.celcom.assingment;
class Employee{
	String name;
	int salary;
	String jobTitle;
	Employee(String name,int salary,String jobTitle){
		this.name= name;
		this.salary=salary;
		this.jobTitle=jobTitle;
	}
	
	void setSalary(int amount) {
		this.salary=amount;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Job Title : "+jobTitle);
		System.out.println("Salary : "+salary);
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee("vel",500000,"trainee");
		
		employee.display();
		
		employee.setSalary(600000);
		
		employee.display();
		
		
		

	}

}
