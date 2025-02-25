package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Assignment4_DB {

	private String url="jdbc:oracle:thin:@Dhanavel-SV:1522:xe";
	private String user="system";
	private String password="87654321";
	
	static Connection connection;
	
	Scanner sc= new Scanner(System.in);
	
	public void connect() throws SQLException {
		connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to Oracle database!");
	}
	

	void createCustomer() throws SQLException {
		System.out.println("Enter the customer details : ");
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter date of birth : ");
		String dob=sc.next();
		System.out.println("Enter address name : ");
		String address=sc.next();
		System.out.println("Enter father name : ");
		String fatherName=sc.next();
		System.out.println("Adhar number");
		long adharNumber=sc.nextLong();
		System.out.println("Phone number");
		long phone=sc.nextLong();
		
		this.connect();
		
		String sql= "insert into customer values(?,?,?,?,?,?)";
		
		PreparedStatement statement=connection.prepareStatement(sql);
		
		statement.setString(1, name);
		statement.setString(2, dob);
		statement.setString(3, address);
		statement.setString(4, fatherName);
		statement.setLong(5, adharNumber);
		statement.setLong(6, phone);
		
		statement.executeUpdate();
		
		System.out.println("Customer added succesfully...!");
		
		
		
	}
	
	void removeCustomer() throws SQLException {
		
		System.out.println("Enter adharnumber of the customer to delete :");
		long adharNumber=sc.nextLong();
		
		String sql="delete from customer where adharnumer=?";
		
		this.connect();
		
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setLong(1, adharNumber);
		
		statement.executeUpdate();
		
		System.out.println("Deleted successfully : ");
		
	}
	
	void viewCustomer() throws SQLException {
		
		String sql="select * from customer";
		
		this.connect();
		PreparedStatement statement= connection.prepareStatement(sql);
		
		ResultSet result=statement.executeQuery();
		
		while(result.next()) {
			
			System.out.println("========Customer Details========");
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
			System.out.println(result.getLong(5));
			System.out.println(result.getLong(6));
			
			System.out.println("================");
		}
		
	}
	
	void update() throws SQLException {
		System.out.println("Enter the adhar number of the customer to update");
		long adharNumber=sc.nextLong();
		
		System.out.println("Enter the customer details to update : ");
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter date of birth : ");
		String dob=sc.next();
		System.out.println("Enter address name : ");
		String address=sc.next();
		System.out.println("Phone number");
		long phone=sc.nextLong();
		
		String sql="update customer set name=? ,dob=? ,address=? ,phone=? where adharnumer=?";
		 
		this.connect();
		PreparedStatement statement=connection.prepareStatement(sql);
		
		statement.setString(1, name);
		statement.setString(2, dob);
		statement.setString(3, address);
		statement.setLong(4, phone);
		
		statement.setLong(5, adharNumber);
		
		statement.executeUpdate();
		
		System.out.println("Customer updated succesfully...!");
		
		
		
	}
	
}
