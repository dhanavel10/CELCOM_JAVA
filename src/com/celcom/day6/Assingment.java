package com.celcom.day6;

import java.util.Scanner;

class DuplicateException extends Exception {
	public String toString() {
		return "Duplicate number in array";
	}

}

public class Assingment {

	public static void main(String[] args) throws DuplicateException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int length = sc.nextInt();
		int arr[] = new int[length];

		try {
			for (int i = 0; i < length; i++) {
				System.out.println("Enter element : ");
				int number = sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (arr[j] == number) {
						throw new DuplicateException();
					}
				}
				arr[i] = number;
			}
		} catch (DuplicateException e) {
			System.out.println(e);
		}

	}

}
