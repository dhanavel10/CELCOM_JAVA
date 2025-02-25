package MultiThreadingPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class User{
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

class BillGenerator implements Callable{

	@Override
	public Integer call() throws Exception {
		
		int a=10;
		
		return a;
	}
	
}

public class Practice {

	public static void main(String[] args) {
		
		List<Future<String>> future= new ArrayList<>();
		ExecutorService exe= Executors.newFixedThreadPool(5);
		exe.execute(null);
		
		
		

	}

}
