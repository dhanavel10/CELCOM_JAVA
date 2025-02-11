package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExample2 {
	static void m1() throws Exception{
		FileReader f= new FileReader("D:\\java traing\\MyProjects\\src\\com\\celcom\\day6\\test.txt");
		System.out.println(f.read());
		f.close();
		throw new Exception();
		
	}
	
	static void m2() {
		try {
			m1();
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("found");
		}
		catch (Exception e) {
			System.out.println("founded");
		}
	}

	public static void main(String[] args) {
		m2();
	}

}
