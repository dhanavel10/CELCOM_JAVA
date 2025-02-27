package com.celcom.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Transaction{
	double amount;
	long timestamp;
	public Transaction(double amount, long timestamp) {
		super();
		this.amount = amount;
		this.timestamp = timestamp;
	}
	
	
}
class Function{
	
	static List<Transaction> arr= new ArrayList<>();
	
	void transactionDetails(double amount) {
		long timestamp=System.currentTimeMillis();
		arr.add(new Transaction(amount,timestamp));
		
	}
	
	
}
class Sort implements Comparator<Transaction >{

	@Override
	public int compare(Transaction o1, Transaction o2) {
		// TODO Auto-generated method stub
		return (int) (o1.amount-o2.amount);
	}
	
}

public class Task1 {

	public static void main(String[] args) {
		
		Collections.sort(Function.arr,new Sort());
		
		for(Transaction t=Function.arr) {
			System.out.println(t.amount);
		}
	}

}
