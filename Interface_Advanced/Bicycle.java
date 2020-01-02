package iFace;
import java.io.*;

public class Bicycle implements Vehicle {
	int speed = 0;
	int gear = 0;

	public void changegear(int newgear) {
		gear = newgear;
	}
	
	public void speedup(int newspeed) {
		speed = speed + newspeed;
	}
	
	public void breakapply(int decrement) {
		speed = speed - decrement;
	}
	
	public void display() {
		System.out.println("Speed: " + speed + "\nGear: " + gear);
	}
}
