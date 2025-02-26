package com.celcom.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class OracleDBConnect {
	static String url="jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	static String user="training";
	static String password="Celcom123";
	
	static Connection connection;

	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
		try {
			connect();
			addData();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public static void connect() throws SQLException {

		connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to Oracle database!");
	}
	
	
	public static void addData() throws SQLException {
		
		System.out.println();
		
		String sql="insert into dhanavel values(1,'dhanavel','trainee')";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.executeUpdate();
		System.out.println("added data");
	}
}
