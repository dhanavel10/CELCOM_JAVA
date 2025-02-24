package jdbc_example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Functions {
	
	Scanner sc= new Scanner(System.in);
	
	Connector connect= new Connector();
	
	

	public void addEmployee() throws SQLException {
		
		System.out.println("Enter name");
		
		String name=sc.next();
		
		System.out.println("Enter age");
		
		int age=sc.nextInt();
		
		System.out.println("Enter salary");
		
		double salary=sc.nextDouble();
		
		System.out.println("Enter phone number");
		
		long phoneNumber=sc.nextLong();
		
		Employee emp= new Employee(name, age, salary, phoneNumber);
		
		connect.newConnect();
		
		String sql="insert into employee(ename,age,salary,phone) values(?,?,?,?)";
		String sql2="select id from employee order by id desc limit 1";
		
		
		PreparedStatement statement= Connector.connection.prepareStatement(sql);
		
		statement.setString(1, name);
		statement.setInt(2,age);
		statement.setDouble(3, salary);
		statement.setLong(4, phoneNumber);
		
		statement.executeUpdate();
		
		System.out.println("Created successfully...");
		
		PreparedStatement statement1= Connector.connection.prepareStatement(sql2);
		ResultSet result= statement1.executeQuery();
		result.next();
		int id=result.getInt(1);
		System.out.println("your id is : "+id);
		
		
		
		
	}
	
	public void removeUser() throws SQLException {
		
		System.out.println("Enter the id to remove the employee");
		
		int id= sc.nextInt();
		connect.newConnect();
		
		String sql= "delete from employee where id=?";
		
		PreparedStatement statement= Connector.connection.prepareStatement(sql);
		
		statement.setInt(1, id);
		
		statement.executeUpdate();
		
		System.out.println("Employee removed");
		
	}
	
	public void update() throws SQLException {
		
		System.out.println("Enter the id to update the employee");
		
		int id= sc.nextInt();
		connect.newConnect();
		
		long phoneNumber=sc.nextLong();
		
		
		String sql= "update employee set phone=? where id=?";
		PreparedStatement statement= Connector.connection.prepareStatement(sql);
		statement.setLong(id, phoneNumber);
		statement.setInt(2, id);
		
		System.out.println("Updated succesfully...");
		
	}
	
	public void viewById() throws SQLException {
		
		ResultSet result=null;
		System.out.println("Enter the id to view the employee details");
		
		int id= sc.nextInt();
		connect.newConnect();
		
		String sql= "select * from employee where id=?";
		PreparedStatement statement= Connector.connection.prepareStatement(sql);
		statement.setInt(1, id);
		try {
			result= statement.executeQuery();
			result.next();
			}
			catch(Exception e) {
				System.out.println("No Employee is available");
			}
		
		System.out.println("======EMPLOYEE DETAILS======");
		System.out.println("Employee id : "+result.getInt(1));
		System.out.println("Employee name : "+result.getString(2));
		System.out.println("Employee age : "+result.getInt(3));
		System.out.println("Employee salary : "+result.getDouble(4));
		System.out.println("Employee number : "+result.getLong(5));
		
		
		
	}
	public void viewByAge() throws SQLException {
		ResultSet result = null;
		
		System.out.println("Enter the age to view the employee details");
		
		int age1= sc.nextInt();
		int age2=sc.nextInt();
		connect.newConnect();
		
		String sql= "select * from employee where age>? and age<?";
		PreparedStatement statement= Connector.connection.prepareStatement(sql);
		statement.setInt(1, age1);
		statement.setInt(2, age2);
		try {
		result= statement.executeQuery();
		}
		catch(Exception e) {
			System.out.println("No Employee is available");
		}
		
		while(result.next()) {
		System.out.println();
		System.out.println("======EMPLOYEE DETAILS======");
		System.out.println();
		System.out.println("Employee id : "+result.getInt(1));
		System.out.println("Employee name : "+result.getString(2));
		System.out.println("Employee age : "+result.getInt(3));
		System.out.println("Employee salary : "+result.getDouble(4));
		System.out.println("Employee number : "+result.getLong(5));
		System.out.println("==============");
		
		}
		
		
	}
	
	
	
	
}
