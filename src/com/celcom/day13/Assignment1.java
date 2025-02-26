package com.celcom.day13;

import java.sql.SQLException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		Functions function = new Functions();

		while (true) {

			System.out.println("==========START==========");
			System.out.println("Enter the choice : ");
			System.out.println("1.Add user");
			System.out.println("2.View user by balance");
			System.out.println("3.View all user");
			System.out.println("4.Remove user");
			System.out.println("5.Deposit balance");
			System.out.println("6.withdraw");
			System.out.println("7.Update balance");
			System.out.println("8.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				function.addCustomer();
				break;

			case 2:
				function.displayUsingId();
				break;

			case 3:
				function.displayCustomers();
				break;

			case 4:
				function.removeCustomer();
				break;

			case 5:
				function.deposit();
				break;
			case 6:
				function.withdraw();
				break;

			case 7:
				function.updateBalance();
				break;

			case 8:
				System.exit(0);

			}

		}
	}

}
