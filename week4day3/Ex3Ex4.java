/*
 * 1. Generate an 8*10 array containing randomly generated 
 * integers between 1 and 100. Find the average of all numbers.
 * 
2. Generate an array list containing 80 randomly generated 
integers between 1 and 100. Find the average of all numbers.
 */
import java.util.Random;
import java.util.ArrayList;

public class Ex3Ex4 {

	public static void main(String[] args) {
		
		int[][] ary = new int[8][10];
		
//		int[][] ary = {{1,2,3}, {4,5,6,7}};
		
		Random generator = new Random();
		
		for (int row = 0; row < ary.length; row++) {
			for (int col = 0; col < ary[row].length; col++) {
				ary[row][col] = generator.nextInt(100) + 1;
			}
		}
		
		int sum = 0;
		for (int row = 0; row < ary.length; row++) {
			for (int col = 0; col < ary[row].length; col++) {
				sum += ary[row][col];
			}
		}
		
		double average = sum / 80.0;
		System.out.println("Average:" + average);
		
		//////////////////////////////////////////////////
		ArrayList<Integer> aryList = new ArrayList<Integer>();
		for (int i = 0; i < 80; i++) {
			aryList.add(generator.nextInt(100) + 1);
		}
		
		sum = 0;
		for (int i = 0; i < 80; i++) {
			sum += aryList.get(i);
		}
		average = sum / 80.0;
		System.out.println("Average:" + average);

	}

}
