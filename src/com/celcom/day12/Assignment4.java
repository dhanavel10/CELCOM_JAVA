package com.celcom.day12;

import java.sql.SQLException;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc= new Scanner(System.in);
		
		Assignment4_DB function = new Assignment4_DB();

		while(true) {
		System.out.println("Enter the choice");
		System.out.println("1.Create customer");
		System.out.println("2.Delete customer");
		System.out.println("3.Update customer");
		System.out.println("4.View customers");
		System.out.println("5.Exit");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			function.createCustomer();
			break;
			
		case 2:
			function.removeCustomer();
			break;
			
		case 3:
			function.update();
			break;
			
		case 4:
			function.viewCustomer();
			break;
		case 5:
			System.exit(0);
		}
		}

	}

}
