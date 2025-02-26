package MultiThreadingPractice;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class User {
	int id;
	String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

class BillGenerator implements Runnable {

	User user;

	public BillGenerator(User user) {
		super();
		this.user = user;
	}

	@Override
	public void run() {
		System.out.println("Generated bill for user " + user.getName());

	}

}

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<User> arr = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Enter id and name");
			arr.add(new User(sc.nextInt(), sc.next()));
		}

		ExecutorService exe = Executors.newFixedThreadPool(10);
		for (User user : arr) {
			exe.execute(new BillGenerator(user));

		}

	}

}
