package CS_4A;
import java.util.Scanner;

public class Employee extends Person {
	private double salary;

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Salary: ");
	salary = sc.nextDouble();		
	}	

	public void display() {
		super.display();
		System.out.println("\nSalary: " + salary);
		
	}
}
