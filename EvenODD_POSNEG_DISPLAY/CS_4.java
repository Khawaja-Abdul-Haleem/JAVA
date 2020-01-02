			//  TASK To PERFORM

// Display Positive Numbers	
// Display Negative Numbers	
// Display Even Negative Numbers
// Display Even Positive Numbers
// Display ODD Negative Numbers
// Display ODD Positive Numbers 

public class CS_4 {
	public static void main(String [] args) {
	
	int arr [] = new int [] {2,3,4,5,-6,-12,13,8,-15,100};
	
	System.out.print("Display Original Array: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	System.out.print("\n....................................................\n....................................................");
	
	System.out.print("\n\nDisplay Positive Numbers: ");
	
	for (int i=0; i<arr.length ; i++) {
		if (arr[i] > 0) {
			System.out.print(arr[i] + " ");
		}
	}
	System.out.print("\n\nDisplay Negative Numbers: ");
	for (int i=0; i<arr.length ; i++) {
		if (arr[i] < 0) {
			System.out.print(arr[i] + " ");
		}
	}
	
	System.out.print("\n\nDisplay even Positive Numbers: ");
			for (int i=0; i<arr.length; i++) {
				if (arr[i] % 2 == 0 && arr[i] > 0) {
					System.out.print(arr[i] + " ");
				}
			}
	System.out.print("\n\nDisplay even NEGATIVE Numbers: ");
	for (int i=0; i<arr.length; i++) {
		if (arr[i] % 2 == 0 && arr[i] < 0) {
			System.out.print(arr[i] + " ");
		}
	}
	
	System.out.print("\n\nDisplay odd positive Numbers: ");
	for (int i=0; i<arr.length; i++) {
		if (arr[i] % 2 != 0 && arr[i] > 0) {
			System.out.print(arr[i] + " ");
		}
	}
	
	System.out.print("\n\nDisplay Odd Negative Numbers: ");
	for (int i=0; i<arr.length; i++) {
		if (arr[i] % 2 != 0 && arr[i] < 0) {
			System.out.print(arr[i] + " ");
		}
	}
	
	}
}
