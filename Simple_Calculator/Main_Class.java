package sample;
import java.util.Scanner;

public class Main_Class {
	public static void main(String [] args) {
		// calculator class object
		Calculator cal = new Calculator();
		
		// Scanner object
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter VAl 1: ");
		// Load in Class object with Scanner Object
		cal.a = sc.nextInt();
		
		System.out.println(" Enter VAL 2: ");
		// Load in Class object with Scanner Object
		cal.b = sc.nextInt();

		// Store Result in Variable AND function cALL
		int sum = cal.sum();
		int mul = cal.mul();
		int sub = cal.sub();
		int divide = cal.div();
	
		// Print out the result
		System.out.println(" SUM (VAL1 + VAL2): " + sum);
		System.out.println(" SUB (VAL1 - VAL2): " + sub);
		System.out.println(" MUL (VAL1 * VAL2): " + mul);
		System.out.println(" DIV (VAL1 / VAL2): " + divide);
		
		
	}
}
