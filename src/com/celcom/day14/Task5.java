package com.celcom.day14;

class Num {
	int number = 0;
	int count;

	public Num(int n) {
		this.count = n;
	}
}

class Odd {

	Num num;

	Odd(Num num) {
		this.num = num;
	}

	void odd() {
		synchronized (num) {
			while (num.count > 0) {
				System.out.println(num.number);
				num.number++;
				num.count--;
				try {
					num.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

class Even {
	Num num;

	Even(Num num) {
		this.num = num;
	}

	void even() {
		synchronized (num) {
			while (num.count > 0) {
				System.out.println(num.number);
				num.number++;
				num.count--;
				num.notify();
			}
		}
	}

}

public class Task5 {

	public static void main(String[] args) {
		Num n = new Num(20);

		Thread t1 = new Thread(() -> {
			Even e = new Even(n);
			e.even();
		});

		Thread t2 = new Thread(() -> {
			Odd o = new Odd(n);
			o.odd();
		});
		t1.start();
		t2.start();

	}

}
