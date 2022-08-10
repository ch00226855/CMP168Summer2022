package week4day2;

public class BinarySearch {
	
	private static class Worker implements Comparable<Worker>{
		private String name;
		private int ID;
		
		public Worker(String name, int ID) {
			this.name = name;
			this.ID = ID;
		}
		
		@Override
		public int compareTo(Worker w) {
			// Compare their names first.
			// If two workers have the same name, compare their ID.
			if (this.name.equals(w.name)) {
				if (this.ID < w.ID) {
					return -1;
				} else if (this.ID == w.ID) {
					return 0;
				} else {
					return 1;
				}
			} else {
				return this.name.compareTo(w.name);
			}
		}
		
		@Override
		public boolean equals(Object o) {
			if (o instanceof Worker) {
				Worker wObj = (Worker) o;
				if (this.name.equals(wObj.name) && this.ID == wObj.ID) {
					return true;
				}
			}
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		int[] testAry = {3, 6, 8, 10, 14, 16, 19, 22, 24, 30, 31, 34};
		int target = 10;
		int targetIndex = binarySearch(testAry, target, 0, testAry.length - 1);
		System.out.println("Target index: " + targetIndex);
		
		Worker w1 = new Worker("Alice", 12345);
		Worker w2 = new Worker("Bob", 23456);
		Worker w3 = new Worker("Clare", 34567);
		Worker w4 = new Worker("Clare", 45678);
		Worker w5 = new Worker("David", 4321);
		Worker w6 = new Worker("Fred", 1234);
		Worker w7 = new Worker("Clare", 123);
		
//		Worker[] workers = {w1, w2, w3, w4, w5};
		Worker[] workers = {w1, w2, w7, w3, w4, w5, w6};
		
		Worker targetWorker = w4;
		
		targetIndex = binarySearch(workers, targetWorker, 0, workers.length - 1);
		System.out.println("Index of target worker: " + targetIndex); // Expect 3
	}
	
	public static int binarySearch(Worker[] ary, Worker target,
									int startIndex, int endIndex) {
		System.out.println("Start Index: " + startIndex + ", End Index: " + endIndex);
		// Base case1: there is one element in range
		if (startIndex == endIndex) {
			if (target.equals(ary[startIndex])) {
				return startIndex;
			} else {
				return -1;
			}
		}
		
		// Base case2: there is no element in range
		if (startIndex > endIndex) {
			return -1;
		}
		
		// Recursive call:
		// Find middle element; handle three cases:
		// - equal
		// - middle element < target
		// - middle element > target
		int middleIndex = (startIndex + endIndex) / 2;
		Worker middleValue = ary[middleIndex];
		if (middleValue.equals(target)) {
			return middleIndex;
		} else if (middleValue.compareTo(target) > 0) {// middleVal > target
			return binarySearch(ary, target, startIndex, middleIndex - 1);
		} else {// middelValue < target
			return binarySearch(ary, target, middleIndex + 1, endIndex);
		}
		
		
		
	}
	
	public static int binarySearch(int[] ary, int target, int startIndex, int endIndex) {
		System.out.println("Start Index: " + startIndex + ", End Index: " + endIndex);
		
		// handle the base case: there is one value in range
		if (startIndex == endIndex) {
			if (ary[startIndex] == target) {
				return startIndex;
			} else {
				return -1;
			}
		}
		
		// Another base case, there is no value in range
		if (startIndex > endIndex) {
			return -1;
		}
	
		// find the middle value, and do a recursive call 
		int middleIndex = (startIndex + endIndex) / 2;
		int middleValue = ary[middleIndex];
		if (middleValue == target) {
			return middleIndex;
		} else if (middleValue > target) {// continue in lower half of the range
			return binarySearch(ary, target, startIndex, middleIndex - 1);
		} else {// continue in the upper half of the range
			return binarySearch(ary, target, middleIndex + 1, endIndex);
		}
	}

}
