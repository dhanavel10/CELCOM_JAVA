package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	private String url="jdbc:oracle:thin:@Dhanavel-SV:1522:xe";
	private String user="system";
	private String password="87654321";
	
	static Connection connection;
	
	public void connect() throws SQLException {
		connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to Oracle database!");
	}

}
