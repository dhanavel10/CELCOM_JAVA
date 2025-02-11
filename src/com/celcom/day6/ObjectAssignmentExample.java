package com.celcom.day6;

public class ObjectAssignmentExample {

	public static void main(String[] args) {
		
		ObjectAssignmentExample obj = new ObjectAssignmentExample();
		
		System.out.println(obj.hashCode());
		
		ObjectAssignmentExample obj2 = obj;
		
		System.out.println(obj2.hashCode());
	}

}
