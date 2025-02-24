package com.celcom.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCExample {

	private static final String url="jdbc:mysql://localhost:3306/training";
	
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc= new Scanner(System.in);
		
		Connection connection = DriverManager.getConnection(url,"root","Dhanu@013");
		
		String sql="insert into test (username,age,address) values(?,?,?)";
		
		
		System.out.println("Enter choice : ");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			PreparedStatement statement=connection.prepareStatement(sql);
			
			
			System.out.println("Enter id,name,age, address");
			
			
			statement.setString(1, sc.next());
			statement.setInt(2,sc.nextInt() );
			statement.setString(3, sc.next());
			
			statement.executeUpdate();
			
			System.out.println("Added successfully");
			break;
			
		case 2 : 
			String sql1="select * from test where id=1";
			PreparedStatement statement2= connection.prepareStatement(sql1);
			
			ResultSet result= statement2.executeQuery();
			result.next();
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getInt(3));
			System.out.println(result.getString(4));
			break;
			
		case 3:
			
			String sql2="delete from test where id=2";
			PreparedStatement statement3= connection.prepareStatement(sql2);
			statement3.executeUpdate();
			
			System.out.println("deleted successfully");
			
		case 4:
			String sql3="truncate table test";
			
			PreparedStatement statement4= connection.prepareStatement(sql3);
			statement4.executeUpdate();
			
			System.out.println("truncated successfully...");
			
			
		case 5:
			String sql4="drop table test";
			PreparedStatement statement5= connection.prepareStatement(sql4);
			statement5.executeUpdate();
			
			System.out.println("dropped table successfully...");
			
			
		}
		
	}

}
