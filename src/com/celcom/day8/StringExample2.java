package com.celcom.day8;

public class StringExample2 {

	public static void main(String[] args) {
		
		String s1="hello ";
		s1=s1.concat("World");  
		System.out.println(s1);
		
		StringBuffer sb= new StringBuffer(s1);
		sb.append(" java");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuilder sb1= new StringBuilder(sb);
		sb1.append(" Programmer");
		System.out.println(sb1);
	}

}
