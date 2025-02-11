package com.celcom.day6;

import java.util.Scanner;

class VowelException extends Exception{
	public String toString() {
		return "Vowel present exception";
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name");
		
		String name = sc.next();
		
		int temp=0;
		try {
		for(int i=0;i<name.length();i++) {
			
				if(name.contains("a") || name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")||
						name.contains("A")||name.contains("E")||name.contains("I")||name.contains("O")||name.contains("UAA")) {
					
					temp=1;
				}
				if(temp==1) {
					throw new VowelException();
				}
				
			
		}
		}
		catch(VowelException e) {
			System.out.println(e);
		}

	}

}
