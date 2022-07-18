package week1day1;

public class ImplicitTypeConversion {

	public static void main(String[] args) {
		
		// Convert an integer to a double
		double x = 100; // 100 -> 100.0 -> x
		
		double y = 1 / 3; // What value is assigned to y?
		// 1 / 3 -> 0 because the results must be an int
		// 0 -> 0.0 -> y
		System.out.println(y);
		
		// What if I want 0.3333 out of 1/3?
		double z = 1 / 3.0;
		// 1 / 3.0 -> 1.0 / 3.0 (implicit conversion)
		// 0.33333 -> z
		System.out.println(z);
		
		
		// -----------------------------
		// Convert to a string
		String output = "x is " + x + "."; // 100.0 -> "100.0"
		System.out.println(output);
		// x is 100
	}

}
