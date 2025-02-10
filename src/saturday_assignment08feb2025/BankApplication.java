package saturday_assignment08feb2025;

import java.util.HashMap;
import java.util.Scanner;

class Account {
	int accountNumber;
	String accountHolderName;
	String branchName;
	int accountBalance;

	Account(int accountNumber, String accountHolderName, String branchName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
	}

	void deposit(int amount) {
		accountBalance += amount;

	}

	void withDraw(int amount) {
		accountBalance -= amount;
	}
}

class Bank {

	public HashMap<Integer, Account> data = new HashMap<>();

	Scanner sc = new Scanner(System.in);

	
	Account account = new Account(sc.nextInt(), sc.next(), sc.next());

	void deposit(int amount) {

		account.deposit(amount);
		System.out.println("Deposit success");

	}

	void withDraw(int amount) {

		account.withDraw(amount);
		System.out.println("withdraw success");

	}

	void setData() {
		if (data.containsKey(account.accountNumber)) {
			System.out.println("Already exist");
		} else {
			data.put(account.accountNumber, account);
		}
		System.out.println("==========");
	}

	void getCurrentAccount() {
		System.out.println("Account holder name : " + data.get(account.accountNumber).accountHolderName);
		System.out.println("Account number : " + data.get(account.accountNumber).accountNumber);
		System.out.println("Account Branch name : " + data.get(account.accountNumber).branchName);
		System.out.println("Account Balance : " + data.get(account.accountNumber).accountBalance);
		System.out.println("==========");
	}

	void getData() {
		for (Account accountDetails : data.values()) {
			System.out.println("Account holder name : " + accountDetails.accountHolderName);
			System.out.println("Account number : " + accountDetails.accountNumber);
			System.out.println("Account Branch name : " + accountDetails.branchName);
			System.out.println("Account Balance : " + accountDetails.accountBalance);
			System.out.println("==========");
		}
	}
}

public class BankApplication {

	public static void main(String[] args) {

		System.out.println("Enter account number ,  name and  branch number ");

		Bank bank = new Bank();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Deposit \n2.Withdraw \n3.Get All Account details \n4.Your Account \n5.exit");
			System.out.println("Enter choice number ");
			int number = sc.nextInt();
			bank.setData();

			switch (number) {

			case 1:
				System.out.println("Enter Amount for deposit : ");
				bank.deposit(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Amount for withdraw : ");
				bank.withDraw(sc.nextInt());
				break;
			case 3:
				System.out.println("Accout data");
				bank.getData();
				break;
			case 4:
				bank.getCurrentAccount();
			case 5:
				return;

			}

		}
	}

}
