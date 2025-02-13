package com.celcom.day8;

public class StringMethodExample2 {

	public static void main(String[] args) {
		
		String s1="Hello world";
		for(char ch:s1.toCharArray()) {
			System.out.print(ch+"");
		}
		
		System.out.println("\n");
		
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i)+"");
		}
		
		System.out.println("\n");
		
		String s2="Hello world java";
		String arr[]=s2.split(" ");
		
		for(String value:arr)
			System.out.println(value);
	}

}
