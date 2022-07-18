package week1day1;

public class IfElseDemo {

	public static void main(String[] args) {
		
		// Find the maximum between x and y
		int x = 700;
		int y = 600;
		int z = 500;
		
		// If x > y then x is the maximum.
		// Otherwise, y is the maximum.
		
		int maximum;
		if (x > y && x > z) {
			maximum = x;
		} else if (y > z) {
			maximum = y;
		} else {
			maximum = z;
		}
		
		System.out.println("Maximum: " + maximum);

	}

}
