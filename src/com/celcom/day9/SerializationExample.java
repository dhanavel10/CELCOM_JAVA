package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient public int id;
	private String ename;
	private int esalary;
	
	Employee(int id,String ename,int esalary){
		this.ename=ename;
		this.id=id;
		this.esalary=esalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}

public class SerializationExample {

	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
		
		Employee obj = new Employee(18374, "Dhanavel", 500000);
		
		//serialization
		
		FileOutputStream fout= new FileOutputStream("D:\\java traing\\MyProjects\\new.txt");
		
		ObjectOutputStream out= new ObjectOutputStream(fout);
		
		out.writeObject(obj);
		fout.close();
		out.close();
		System.out.println("Object Saved");
		
		//de - serialization
		
		FileInputStream in= new FileInputStream("D:\\java traing\\MyProjects\\new.txt");
		
		ObjectInputStream input= new ObjectInputStream(in);
		
		Employee emp=(Employee) input.readObject();
		
		in.close();
		input.close();
		System.out.println(emp);
	}

}
