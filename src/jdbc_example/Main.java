package jdbc_example;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		Functions function = new Functions();

		while (true) {
			System.out.println("Enter the choice : ");
			System.out.println("1.Add employee");
			System.out.println("2.Remove employee");
			System.out.println("3.View employee by id");
			System.out.println("4.view employee by age");
			System.out.println("5.Update employee number");
			System.out.println("6.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				function.addEmployee();
				break;

			case 2:
				function.removeUser();
				break;

			case 3:
				function.viewById();
				break;

			case 4:
				function.viewByAge();
				break;
				
			case 5:
				function.update();
				break;
			
			case 6:
				System.exit(0);
			}
		}
	}

}
