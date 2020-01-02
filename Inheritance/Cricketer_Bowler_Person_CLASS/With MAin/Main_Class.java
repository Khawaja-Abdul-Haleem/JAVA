package CS_4A;
import java.util.Scanner;
public class Main_Class {
	public static void main (String [] args) {
		Person p = new Person();
		Employee emp = new Employee();
		Cricketer cri = new Cricketer();
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("\n...Person Input...");	
		p.input();
		 
	
		System.out.println("\n...Employee Input...");		
		emp.input();
			System.out.println("\n...Cricketer Input...");	
			cri.input();
		
		System.out.println("\n\nDisplay...\n");
		
		System.out.println("\nPerson");
		p.display();
		
		System.out.println("\n\n\nEmployee");
		emp.display();
		
		System.out.println("\n\n\nCricketer");
		cri.display();
	}
}
