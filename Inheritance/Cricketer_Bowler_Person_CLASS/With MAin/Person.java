package CS_4A;
import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String city;
	
	
public void input() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter age: ");
	age = sc.nextInt();
	
	System.out.println("Enter Name: ");
	name = sc.next();
	
	System.out.println("Enter City: ");
	city = sc.next();
}	

public void display() {
	System.out.println("\nName: " + name);
	System.out.println("\nAge " + age);
	System.out.println("\nCity: " + city);
	
}

}
