package com.celcom.day10;

import java.util.Scanner;

class SavingsAccount{
	
	long balance;
	
	SavingsAccount(long balance){
		this.balance=balance;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}

class Deposit extends Thread{
	
	SavingsAccount savingsAccount;
	
	Deposit(SavingsAccount savingsAccount){
		this.savingsAccount=savingsAccount;
	}
	
	public void run() {
		
		synchronized(savingsAccount) {
			System.out.println("Deposit is running");
			System.out.println("Enter Amount :");
			Scanner sc= new Scanner(System.in);
			
			long amount= sc.nextLong();
			savingsAccount.setBalance(amount);
			
			System.out.println("Depositted success : "+amount);
			savingsAccount.notifyAll();
		}
		
	}
	
}

class WithDraw extends Thread{
	
	SavingsAccount savingsAccount;
	
	public WithDraw(SavingsAccount savingsAccount) {
		this.savingsAccount=savingsAccount;
	}
	
	
	public void run() {
		
		synchronized(savingsAccount) {
			
			
			try {
				System.out.println("WithDraw is waiting for deposit");
				savingsAccount.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Withdraw complete "+savingsAccount.getBalance());
		}
		
		
	}
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savings = new SavingsAccount(0);
		
		WithDraw withdraw= new WithDraw(savings);
		withdraw.start();
		WithDraw withdraw1= new WithDraw(savings);
		withdraw1.start();
		
		
		Deposit deposit= new Deposit(savings);
		deposit.start();
		

	}

}
