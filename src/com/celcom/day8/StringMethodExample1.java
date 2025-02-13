package com.celcom.day8;

public class StringMethodExample1 {

	public static void main(String[] args) {
		String str= "Helloo";
		
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.contains("oo"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toCharArray());
		System.out.println(str.concat(" World"));
		System.out.println(str.replace('o', 'z'));
		System.out.println(str.equals("helloo"));
		System.out.println(str.substring(1,4));
		System.out.println(str.substring(3));
		
	}

}
