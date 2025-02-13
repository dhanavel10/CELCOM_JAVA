package com.celcom.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamExample2 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("D:\\java traing\\MyProjects\\src\\com\\celcom\\day8\\test.txt");
		FileReader fr= new FileReader("D:\\java traing\\MyProjects\\src\\com\\celcom\\day8\\example.txt");
		
		int ch=0;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		System.out.println("copied");
		
		fr.close();
		fw.close();
		
		
	}

}
