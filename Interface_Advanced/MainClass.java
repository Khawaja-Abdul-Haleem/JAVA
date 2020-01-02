package iFace;
//import java.io.*;

public class MainClass {
	public static void main(String [] args) {
		Bicycle b = new Bicycle();
		b.changegear(2);
		b.speedup(3);
		b.breakapply(1);
		
		System.out.println("Bicycle Represent its states: ");
		b.display();
	
		Bike bk = new Bike();
		bk.changegear(3);
		bk.speedup(3);
		bk.breakapply(2);
		
	
		
		System.out.println("\nBIKE represent its states");
		bk.display();
		
	 	
		
	}
}
