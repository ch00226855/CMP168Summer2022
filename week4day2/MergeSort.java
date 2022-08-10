package week4day2;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
	
		int[] ary = {3, 1, 4, 5, 19, 26, 17, 8};
		
		mergeSort(ary, 0, ary.length - 1);
		
		System.out.println(Arrays.toString(ary));

	}
	
	public static void mergeSort(int[] ary, int startIndex, int endIndex) {
		// base cases 1: there is 0/1 element in range
		if (startIndex >= endIndex) {
			return;
		}
		
		// base case 2: there are 2 elements in range
		if (startIndex + 1 == endIndex) {
			if (ary[startIndex] > ary[endIndex]) {
				int temp = ary[startIndex];
				ary[startIndex] = ary[endIndex];
				ary[endIndex] = temp;
			}
			return;
		}

		// recursive call
		int middleIndex = (startIndex + endIndex) / 2;
		mergeSort(ary, startIndex, middleIndex-1);
		mergeSort(ary, middleIndex, endIndex);
		merge(ary, startIndex, middleIndex, endIndex);
	}
	
	public static void merge(int[] ary, int startIndex,
							int middleIndex, int endIndex) {
		System.out.println("Start: " + startIndex + ", middle: " +
							middleIndex + ", end: " + endIndex);
		System.out.println("BEFORE: " + Arrays.toString(ary));
		
		// We need a running index for each half
		// Gradually add elements to a new array
		// replace the existing part with the new array
		int firstIndex = startIndex;
		int secondIndex = middleIndex;
		
		int[] newAry = new int[endIndex - startIndex + 1];
		int newIndex = 0;
		
		// Merge two arrays
		while(firstIndex < middleIndex && secondIndex <= endIndex) {
			if (ary[firstIndex] <= ary[secondIndex]) {
				newAry[newIndex] = ary[firstIndex];
				newIndex++;
				firstIndex++;
			} else {
				newAry[newIndex] = ary[secondIndex];
				newIndex++;
				secondIndex++;
			}
		}
		
		// Add the remaining part of the first array to new array
		while(firstIndex < middleIndex) {
			newAry[newIndex] = ary[firstIndex];
			newIndex++;
			firstIndex++;
		}
		
		// Add the remianing part of the second array to new array
		while(secondIndex <= endIndex) {
			newAry[newIndex] = ary[secondIndex];
			newIndex++;
			secondIndex++;
		}
		
		// Update ary with new array
		for (int i = 0; i < newAry.length; i++) {
			ary[startIndex + i] = newAry[i];
		}
		System.out.println("AFTER : " + Arrays.toString(ary));
	}

}
