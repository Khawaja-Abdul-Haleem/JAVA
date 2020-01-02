package BSCS_02;

public class Basic_Java {
	public static void  main (String args[]) {
		byte b=3;
		byte c=4;
		//byte result = b+c; // error... to solve: type casting method used here
		byte result = (byte)(b+c);
		int sum = (b+c); // implicit type casting
		int a = b;	
		System.out.println("PAKISTAN" + " " + result);
		System.out.println("City" + " " + sum);
		System.out.println("Street" + " " + a);
		byte d = 113;
		byte e = 114;
		byte test = (byte)(d+e);
		System.out.println("\nresult " + " " + test);
		
		 if (d<e) {
			 System.out.println("d is less than e");
		 }	 else
			 {
				 System.out.println("d is greater than e");
			 }
		String ab = "ASLAM";
		System.out.println(ab);
		for (int i=0; i<5; i++) {
			String cb = "ASLAM";
			
			System.out.println("\n"+ i + ":"+ cb);
		}
		
		int x = 3;
		int y = 4;
		int z = 2;
		if (x > y & x > z) {
			System.out.println("X is greater and value is: " + x);
		}
		else if (y > x & y > z) {
			System.out.println("Y is greater and value is: " + y);
		}
		else if (z > x & z > y) {
			System.out.println("Z is greater and value is: " + z);
		}


	}
}
