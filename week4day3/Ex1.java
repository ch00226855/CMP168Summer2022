import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		// Read from file Integers.txt
		// Parse each line into an array of int
		// Find the largest and the smallest value
		
		String line;
//		int maxSoFar = 0; // 0 will be replaced later
//		int minSoFar = 0;
//      boolean isFirstLine = true;
		
		int maxSoFar = Integer.MIN_VALUE;
		int minSoFar = Integer.MAX_VALUE;
		
		FileInputStream file = null;
		Scanner fileInput = null;
		
		try {
			 file = new FileInputStream("Integers.txt");
			 fileInput = new Scanner(file);

		} catch (IOException e) {
			System.out.println("File Integers.txt does not exist.");
		}
		
		while(fileInput.hasNext()) {
			
			line = fileInput.nextLine();
			String[] integers = line.split(", ");
			int[] ints = new int[integers.length];
			for (int i = 0; i < integers.length; i++) {
				ints[i] = Integer.parseInt(integers[i]);
			}
			System.out.println(Arrays.toString(ints));

//			if (isFirstLine) {
//				maxSoFar = ints[0];
//				minSoFar = ints[0];
//				isFirstLine = false;
//			}
//			
			for (int i = 0; i < ints.length; i++) {
				if (ints[i] > maxSoFar) {
					maxSoFar = ints[i];
				}
				
				if (ints[i] < minSoFar) {
					minSoFar = ints[i];
				}
			}
		}
		
		System.out.println("Maximum: " + maxSoFar);
		System.out.println("Minimum: " + minSoFar);
		
		fileInput.close();
		
	}

}
