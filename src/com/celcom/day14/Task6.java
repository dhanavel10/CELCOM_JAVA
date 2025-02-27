package com.celcom.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
	String user;
	User(String user){
		this.user=user;
	}
}

class Ticket {

	//List<User> user = new ArrayList<>();
	//List<User> tick = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	User[] tick= new User[10];

	void bookTicket(User user,int seatNumber) {
//		int q = 1;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(q + " ");
//				q += 1;
//			}
//			System.out.println();
//		}
		int book =seatNumber;
		synchronized (tick) {
			
				if(tick[book] == null) {
					System.out.println(book+" Booked successfully for user "+user.user+" "+Thread.currentThread());
					tick[book]=user;
				}
				else {
					System.out.println(book+ " Not available , booked by "+tick[book].user+ " "+Thread.currentThread());
				}
			}
		
	}

}

public class Task6 {

	public static void main(String[] args) {

		Ticket t= new Ticket();
		Thread t1=new Thread(()->{
			User user=new User("user1");
			t.bookTicket(user,1);
			t.bookTicket(user,2);
			t.bookTicket(user,3);
		});
		Thread t2=new Thread(()->{
			User user=new User("user2");
			t.bookTicket(user,4);
			t.bookTicket(user,2);
			t.bookTicket(user,5);
		});
		Thread t3=new Thread(()->{
			User user=new User("user3");
			t.bookTicket(user,4);
			t.bookTicket(user,5);
			t.bookTicket(user,9);
		});
		t1.start();
		t2.start();
		t3.start();

	}

}
