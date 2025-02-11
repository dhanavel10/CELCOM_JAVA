package com.celcom.day6;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public String toString() {
		return "Invalid age for vote";
	}
}

public class UserDefinedException {

	public static void main(String[] args) {

		int age;

		Scanner sc = new Scanner(System.in);

		age = sc.nextInt();

		if (age > 18) {
			System.out.println("Can vote");
		} else {

			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}

	}

}
