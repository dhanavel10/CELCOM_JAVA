package jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	private static final String url ="jdbc:mysql://localhost:3306/training";
	static Connection connection;
	
	
	public void newConnect() throws SQLException{

			connection = DriverManager.getConnection(url,"root","Dhanu@013");
		}
}
