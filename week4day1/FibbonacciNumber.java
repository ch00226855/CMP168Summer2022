package week4day1;

public class FibbonacciNumber {

	public static void main(String[] args) {
		int n = 40;
		
		System.out.println(fibByLoop(n));
		
		System.out.println(fib(n));
	}
	
	public static int fibByLoop(int n) {
		// create an array, calculate the 1st, 2nd, ..., the n-th Fibbonacci number
		int[] ary = new int[n];
		
		ary[0] = 0;
		ary[1] = 1;
		
		for (int i = 2; i < n; i++) {
			ary[i] = ary[i-1] + ary[i-2];
		}
		return ary[n-1];
	}
	
	public static int fib(int n) {
		// treat base cases separatedly
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}

}
