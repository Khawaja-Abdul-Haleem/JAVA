package CS_4A;
import java.util.Scanner;

public class Cricketer extends Person{
	private int totalscore;
	Scanner sc = new Scanner(System.in);
	
public void input() {
	super.input();
	System.out.println("Enter total Score: ");
	totalscore = sc.nextInt();
}
	public void display() {
		super.display();
		System.out.println("\nTotal Score: " + totalscore);
	
	}
}
