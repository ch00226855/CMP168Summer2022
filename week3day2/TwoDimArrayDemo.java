package week3day2;

import java.util.Arrays;
import java.util.Random;

public class TwoDimArrayDemo {

	public static void main(String[] args) {
		
		int[][] ary = new int[2][3];
		
		ary[0][0] = 0;
		ary[0][1] = 1;
		ary[0][2] = 2;
		ary[1][0] = 3;
		ary[1][1] = 4;
		ary[1][2] = 5;
		
		for (int row = 0; row < 2; row++) {
			// Assign values to a row
			for (int col = 0; col < 3; col++) {
				// Assign a value to ary[row][rol]
				ary[row][col] = (int)(Math.random() * 100); // Generates a random integer between 0 and 99.
			}
		}
		
		for (int row = 0; row < ary.length; row++) {// ary.length -> number of rows
			for (int col = 0; col < ary[row].length; col++) {//ary[row].length -> number of columns
				System.out.println(ary[row][col]);
			}
		}
		
		// Define a 2D array with a group values
		int[][] ary2 = {{1, 2, 3}, {4, 5, 6, 7}};
		for (int row = 0; row < ary2.length; row++) {// ary.length -> number of rows
			for (int col = 0; col < ary2[row].length; col++) {//ary[row].length -> number of columns
				System.out.println(ary2[row][col]);
			}
		}

		// In project 2, you need to create a 10*10 array with 25 bombs.
		boolean[][] bombGrid = new boolean[10][10];
		// How do we choose 25 cells from these 100 cells?
		// Define a addOneBomb() method, that adds a new bomb to the grid
		// Call this method 25 times.
		
		// Assign false to all cells.
		for (int row = 0; row < bombGrid.length; row++) {
			for (int col = 0; col < bombGrid[row].length; col++) {
				bombGrid[row][col] = false;
			}
		}
		
		// Call addOneBomb() method 25 times.
		for (int i = 0; i < 25; i++) {
			addOneBomb(bombGrid);
		}
		
		printGrid(bombGrid);
	}
	
	private static void printGrid(boolean[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			System.out.println(Arrays.toString(grid[row]));
		}
	}
	
	private static void addOneBomb(boolean[][] grid) {
		Random generator = new Random();
		while(true) {// we will terminate this loop using a break statement
			int rowIndex = generator.nextInt(grid.length); // Generate a random int between 0 and length-1
			int colIndex = generator.nextInt(grid[rowIndex].length);
			// Check if this cell already contains a bomb.
			if (grid[rowIndex][colIndex]) {
				continue; // start a new iteration
			} else {
				grid[rowIndex][colIndex] = true; // put a new bomb here
				break;
			}
		}
	}

}
