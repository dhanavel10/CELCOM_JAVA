package com.celcom.day3;

class Employee
{
	private int eid;
	private String ename;
	private int salary;
	
	

	public Employee() {
		super();
	
	}
	
	
	
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}



	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee emp1= new Employee(1,"dani",500000);
		
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getSalary());
		
		//setting values
		
		emp1.setEid(2);
		emp1.setEname("vel");
		emp1.setSalary(500000);
		
		
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getSalary());
		
		

	}

}
