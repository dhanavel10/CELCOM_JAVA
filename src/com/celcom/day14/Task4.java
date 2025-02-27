package com.celcom.day14;

class Bank{
	int balance=1000;
	
	synchronized void deposit(int amount) {
		
		balance+=amount;
		System.out.println("Depositted successfully...");
		
		System.out.println("Current balance : "+balance);
		
	}
	synchronized void withdraw(int amount) {
		if(balance-amount<0) {
			System.out.println("Insuffiecent balance...");
		}
		else {
			balance-=amount;
			System.out.println("Withdraw successfully...");
			
		}
		System.out.println("Current balance : "+balance);
	}
	
	
}

public class Task4 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
	
		Thread t1= new Thread(()->{
			bank.deposit(1000);
		});
		Thread t2= new Thread(()->{
			bank.withdraw(2000);
		});
		Thread t3= new Thread(()->{
			bank.withdraw(1000);
		});
		t1.start();
		t2.start();
		t3.start();

	}

}
