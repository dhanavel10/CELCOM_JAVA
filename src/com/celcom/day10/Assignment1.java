package com.celcom.day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

class Task{
	boolean done;
	String task;
	int id;
	public Task(boolean done, String task, int id) {
		super();
		this.done = done;
		this.task = task;
		this.id = id;
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Functions function = new Functions();
		while(true) {
		System.out.println("Enter choice");
		System.out.println("1.Add task \n2.View Task \n3.Mark as done \n4.Delete task \n5.Search task \n6.exit");
		int choice=sc.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Add task");
			function.addTask();
			break;
		
		case 2:
			System.out.println("view task");
			function.viewTask();
			break;
		case 3:
			System.out.println("mark as done");
			function.markDone();
			break;
			
		case 4:
			System.out.println("delete task");
			function.deleteTask();
			break;
		
		case 5:
			System.out.println("search task");
			function.searchTask();
			break;
		case 6:
			System.out.println("Exit");
			System.exit(0);
		}
		}
	}

}

class Functions{
	
	static HashMap<Integer,Task> data= new HashMap<>();
	
	Scanner sc= new Scanner(System.in);
	static int no=0;
	
	void addTask() {
		
		System.out.println("Enter the task : ");
		String toDoTask=sc.next();
		
		Task t= new Task(false,toDoTask,Functions.no);
		
		data.put(no,t );
		no+=1;
		
		
	}
	void viewTask() {
		for(Task value:data.values()) {
			String temp="Not done";
			if(value.done) {
				temp="Done";
			}
			System.out.println(value.id+". "+value.task+" === "+ temp);
			
			
		}
	}
	
	void markDone() {
		int i=1;
		for(Task value:data.values()) {
			String temp="Not done";
			if(value.done) {
				temp="Done";
			}
			System.out.println(value.id+". "+value.task+" === "+ temp);
			
			
		}
		System.out.println("Enter id to mark read...");
		int num= sc.nextInt();
		if(data.containsKey(num)) {
		data.get(num).done=true;
		}
		else {
			System.out.println("Enter valid id number");
		}
		
	}
	
	void deleteTask() {
		for(Task value:data.values()) {
			String temp="Not done";
			if(value.done) {
				temp="Done";
			}
			System.out.println(value.id+". "+value.task+" === "+ temp);
			
			
		}
		
		System.out.println("Enter the id to delete");
		int id=sc.nextInt();
		data.remove(id);
	}
	
	void searchTask() {
		for(Task value:data.values()) {
			String temp="Not done";
			if(value.done) {
				temp="Done";
			}
			System.out.println(value.id+". "+value.task+" === "+ temp);
			
			
		}
		
		System.out.println("Search task");
		String s= sc.next();
		
		for(Task value:data.values()) {
			if(value.task.contains(s)) {
				System.out.println(value.task);
			}
		}
	}
	
}
