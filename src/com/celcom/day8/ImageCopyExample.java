package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ImageCopyExample {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fr= new FileInputStream("D:\\java traing\\download.jpg");
		
		FileOutputStream fw = new FileOutputStream("D:\\java traing\\new.jpg");
		
		int ch=0;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		System.out.println("copied");
		
		fr.close();
		fw.close();
		
	}

}
