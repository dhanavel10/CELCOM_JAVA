package com.celcom.day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader fr= new FileReader("D:\\java traing\\MyProjects\\src\\com\\celcom\\day8\\example.txt");
			//System.out.println(fr.read());
			int ch=0;
			while((ch=fr.read())!=-1) {
				System.out.println((char)ch);
			}
			
			System.out.println(fr.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
