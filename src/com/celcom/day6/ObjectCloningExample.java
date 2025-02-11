package com.celcom.day6;

public class ObjectCloningExample implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ObjectCloningExample obj = new ObjectCloningExample();
		
		ObjectCloningExample obj2=(ObjectCloningExample) obj.clone();
		
		System.out.println(obj.hashCode());
		
		System.out.println(obj2.hashCode());

	}

}
