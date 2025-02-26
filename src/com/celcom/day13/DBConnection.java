package com.celcom.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static String url="jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	static String user="training";
	static String password="Celcom123";
	
	static Connection connection;
	
	public Connection connect() {
		
		try {
			connection=DriverManager.getConnection(url,user,password);
			System.out.println("Connected Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
