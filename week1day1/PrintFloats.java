package week1day1;

public class PrintFloats {

	public static void main(String[] args) {
		
		final double y = 1.0 / 3.0; // final prevents y from modification.
		
		System.out.println(y);
		
		// The following statement will raise
		// an error
		// y = 2.34;
		
		// Print y with only 2 decimal digits
		System.out.printf("%.2f", y);

	}

}
