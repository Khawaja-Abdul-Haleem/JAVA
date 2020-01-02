package iFace;
import java.io.*;

public class Bike implements Vehicle{
	int gear = 0;
	int speed = 0;
	
	public void changegear(int newgear) {
		this.gear = newgear;
	}
	
	public void speedup(int newspeed) {
		this.speed = speed + newspeed;
	}
	
	public void breakapply(int dec) {
		this.speed = speed - dec;
	}
	
	public void display() {
		System.out.println("Speed: " + this.speed + "\nGear: " + this.gear);
	}
}
