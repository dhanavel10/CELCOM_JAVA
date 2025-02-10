package saturday_assignment08feb2025;

import java.util.HashMap;
import java.util.Scanner;

class Book {
	String title;
	String author;
	int isbn;

	Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

}

class BookManage {
	Scanner sc = new Scanner(System.in);

	HashMap<Integer, Book> bookStore = new HashMap<>();

	void addBook() {
		Book book = new Book(sc.next(), sc.next(), sc.nextInt());
		bookStore.put(book.isbn, book);

		System.out.println("Book added!!");
		System.out.println("==========");
	}

	void removeBoo(int isbn) {

		bookStore.remove(isbn);
		System.out.println("Removed the book!!");
		System.out.println("==========");
	}

	void display() {
		int i=0;
		for (Book book : bookStore.values()) {
			System.out.println("Book title : " + book.title);
			System.out.println("Book Author" + book.author);
			System.out.println("ISBN : " + book.isbn);
			i=1;

		}
		if(i==0) {
			System.out.println("No book available!!!");
		}
		System.out.println("==========");
	}
}

public class BookApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookManage manage = new BookManage();
		while (true) {

			System.out.println("1.Add book \n2.Remove book \n3.Display all books \n4.exit");
			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter title, author and isbn of the book ");
				manage.addBook();
				break;
			case 2:
				System.out.println("Enter isbn of the book to remove");
				int isbn = sc.nextInt();
				manage.removeBoo(isbn);
				break;
			case 3:
				manage.display();
				break;
			case 4:
				return;

			}

		}

	}

}
