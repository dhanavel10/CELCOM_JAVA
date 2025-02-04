import java.util.Scanner;

public class UserInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter id name and salary");
		int eid=sc.nextInt();
		String empName=sc.next();
		double empSalary=sc.nextDouble();
		System.out.println("Employee id : " +eid);
		System.out.println("Employee Name : "+empName );
		System.out.println("Employee salary :"+empSalary);

	}
}