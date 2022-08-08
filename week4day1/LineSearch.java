package week4day1;

public class LineSearch {
	
	public static void main(String[] args) {
		int LENGTH = 100_000_000;
		int TARGET_INDEX = LENGTH - 1;
		
		// Create a large array and invoke the line search method
		int[] testAry = new int[LENGTH];
		
		for (int index = 0; index < LENGTH - 1; index++) {
			testAry[index] = 0;
		}
		
		testAry[LENGTH - 1] = 1;
		
		long timeBefore = System.currentTimeMillis();
		System.out.println(lineSearch(testAry, 1)); // should give the last index (this is the worst case for line search)
		long timeAfter = System.currentTimeMillis();
		System.out.println("Searching time: " + (timeAfter - timeBefore) / 1000.0);
	}
	
	public static int lineSearch(int[] ary, int target) {
		
		// starting from index 0, compare each value with target
		
		for(int i = 0; i < ary.length; i++) {
			if (ary[i] == target) {
				return i;
			}
		}
		
		return -1;
	}

}
