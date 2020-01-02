package functionsDemo;

public class MainClass {
	public static void main(String [] args) {
		
		MethodsExample mE = new MethodsExample ();
		
		mE.a = 5;
		mE.b = 4;
		
		int Sum = mE.sum();
		int mul = mE.multiply();
	    int divide = mE.divide();
	    int sub = mE.sub();
	    
		String NAME = mE.c;
		
		System.out.println(" \n Sum: " + Sum + "\tand NAME: " + NAME);
		System.out.println(" \n Multiply: " + mul);
		System.out.println(" \n Subtract: " + sub);
		System.out.println(" \n Divide: " + divide);
	}
}
