package com.celcom.day11;

import java.util.Scanner;

public class MicrowaveHeatingTime {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int items=sc.nextInt();
		
		float heatingTime=sc.nextInt();
		
		String type=sc.next();
		
		String model=sc.next();
		
		
		if(items==2)
			heatingTime= (float) ((heatingTime)+(heatingTime)*(0.5));
		
		else if(items==3)
			heatingTime=(float) ((heatingTime)*2);
		
		if(type.equals("Pasta")) {
			heatingTime=(float) ((heatingTime)+(heatingTime)*(0.1));
			
		}
		else if(type.equals("Frozen meal")) {
			heatingTime=(float) ((heatingTime)+(heatingTime)*(0.2));
		}
		
		if(model.equals("medium")) {
			heatingTime=(float) ((heatingTime)-(heatingTime)*(0.1));
		}
		else if(model.equals("low")) {
			heatingTime=(float) ((heatingTime)-(heatingTime)*(0.2));
		}
		System.out.println(heatingTime);
		

	}

}
