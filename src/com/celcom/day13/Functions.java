package com.celcom.day13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Functions {
	
	String maxId="select MAX(id) from customerTab";
	String addToTable="insert into customerTab values(?,?,?,?)";
	String displayAll="select * from customerTab";
	String displayById="select * from customerTab where balance>?";
	String updateBalance="update customerTab set balance=? where id =?";
	String deleteCustomer="delete customerTab where id= ?";
	String deposit="update  customerTab set balance=balance+? where id =?";
	String withdraw="update customerTab set balance=balance-? where id =?";
	String checkBal="select balance from customerTab where id=?";

	Connection conn;
	
	DBConnection db= new DBConnection();
	Scanner sc= new Scanner(System.in);
	Random rand= new Random();
	
	
	PreparedStatement statement=null;
	ResultSet result=null;
	
	
	void addCustomer() throws SQLException{
		
		conn=db.connect();
		int id = 0;
		
		System.out.println("Enter the name : ");
		String name=sc.next();
		//account number
		int accNumber= rand.nextInt(10000,99999);
		
		double balance =0;
		
		
		
		try {
			statement= conn.prepareStatement(maxId);
			result=statement.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		if(result.next()) {
			id=result.getInt(1)+1;
		}
		else {
			id=0;
		}
		
		try {
			statement= conn.prepareStatement(addToTable);
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setInt(3, accNumber);
			statement.setDouble(4, balance);
			

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		statement.executeUpdate();
		
		System.out.println("Created user...");
		System.out.println("Your account number is : "+accNumber);
		
	}
	
	void displayCustomers() {
		
		conn=db.connect();
		
		try {
			statement= conn.prepareStatement(displayAll);
			result=statement.executeQuery();
			
			while(result.next()) {
				
				System.out.println("==========Customer details==========");
				System.out.println("ID : "+result.getInt(1));
				System.out.println("NAME : "+result.getString(2));
				System.out.println("ACCOUNT NUMBER : "+result.getInt(3));
				System.out.println("BALANCE : "+result.getDouble(4));
				
				System.out.println("Fetched successfully...");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void displayUsingId() {
		System.out.println("Enter balance to view : ");
		double balance=sc.nextDouble();
		
		try {
			statement= conn.prepareStatement(displayById);
			statement.setDouble(1, balance);
			result=statement.executeQuery();
			
			if(result.next()) {
				
				System.out.println("==========Customer details==========");
				System.out.println("ID : "+result.getInt(1));
				System.out.println("NAME : "+result.getString(2));
				System.out.println("ACCOUNT NUMBER : "+result.getInt(3));
				System.out.println("BALANCE : "+result.getDouble(4));
				
				System.out.println("Fteched successfully...");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	void updateBalance() {
		
		conn=db.connect();
		System.out.println("Enter the id to update the balance : ");
		int id=sc.nextInt();
		
		System.out.println("Enter balance to update : ");
		double balance=sc.nextDouble();
		
		try {
			statement =conn.prepareStatement(updateBalance);
			statement.setInt(2, id);
			statement.setDouble(1, balance);
			statement.executeUpdate();
			
			System.out.println("Updated successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	void withdraw() {
		
		conn=db.connect();
		System.out.println("Enter the id to update the balance : ");
		int id=sc.nextInt();
		
		System.out.println("Enter balance to withdraw : ");
		double balance=sc.nextDouble();
		
		
		try {
			statement =conn.prepareStatement(checkBal);
			statement.setInt(1, id);
			result=statement.executeQuery();
			result.next();
			if((result.getDouble(1)-balance)<0) {
				throw new SQLException();
			}
		} catch (SQLException e) {
			
			System.out.println("Balance Insuffient...");
			return;
			
		}
		
		try {
			statement =conn.prepareStatement(withdraw);
			statement.setInt(2, id);
			statement.setDouble(1, balance);
			statement.executeUpdate();
			
			System.out.println("Updated successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	void deposit() {
		
		conn=db.connect();
		System.out.println("Enter the id to update the balance : ");
		int id=sc.nextInt();
		
		System.out.println("Enter balance to deposit : ");
		double balance=sc.nextDouble();
		
		try {
			statement =conn.prepareStatement(deposit);
			statement.setInt(2, id);
			statement.setDouble(1, balance);
			statement.executeUpdate();
			
			System.out.println("Updated successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	void removeCustomer() {
		conn=db.connect();
		System.out.println("Enter the id to update the balance : ");
		int id=sc.nextInt();
		
		try {
			statement =conn.prepareStatement(withdraw);
			statement.setInt(1, id);
			statement.executeUpdate();
			
			System.out.println("Removed succesfully...");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
}
