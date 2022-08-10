package week4day2;

public class MemoryLeakDemo {

	public static void main(String[] args) {
		
		int[] ary = new int[3]; // 24 bytes are allocated to create this array.
		ary[0] = 0;
		ary[1] = 1;
		ary[2] = 2;

		ary = new int[] {100, 200, 300}; // We created a new array and call it ary.
	}

}
