package com.celcom.day12;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleSql {

	public static void main(String[] args) throws SQLException {
		
		Connector c= new Connector();
		c.connect();
		
		String sql="insert into test values(3,'dani',234567)";
		
		PreparedStatement st= Connector.connection.prepareStatement(sql);
		
		st.executeQuery();
		
		System.out.println("Added");

	}

}
