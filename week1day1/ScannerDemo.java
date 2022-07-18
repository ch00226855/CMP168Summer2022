package week1day1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// Read an integer
		System.out.println("Please enter an integer:");
		int x = scnr.nextInt();
		
		// Read a floating point number
		System.out.println("Please enter a floating point number:");
		double y = scnr.nextDouble();
		
		// There is an invisible new line symbol.
		// Call nextLine() to waste it
		scnr.nextLine();
		
		// Read a string
		System.out.println("Please enter a string:");
		String z = scnr.nextLine();
		
		// Print x, y, z
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);

	}

}
