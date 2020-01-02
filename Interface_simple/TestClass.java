package iFAce;
import java.io.*;

interface IFace1{
	final int a = 10;
	int b = a +1;
	void display();
}

public class TestClass implements IFace1 {
	public void display() {
		System.out.println("Yew are in (TestClass)..");
	}

	public static void main(String [] args) {
		TestClass tc = new TestClass();
		tc.display();
		System.out.println(a + " " + b );;
		
	}
}
