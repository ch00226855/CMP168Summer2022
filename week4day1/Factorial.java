package week4day1;

public class Factorial {
	
	public static void main(String[] args) {
		// Calculate 10! (the factorial of 10) using a loop
		System.out.println(factorialByLoop(10));
		
		// calculate 10! using a recursive method
		System.out.println(factorialByRecursion(10));
	}
	
	public static int factorialByLoop(int x) {
		// multiply x with x-1, x-2, ..., 1
		int product = 1;
		for (int i = x; i >= 1; i--) {
			product *= i;
		}
		return product;
	}
	
	public static int factorialByRecursion(int x) {
		// x! = (x-1)! * x
		System.out.println("Starting method call with x = " + x);
		int result;
		if (x == 1) {
			result = 1;
		} else {
			result = x * factorialByRecursion(x - 1);
		}
		System.out.println("Ending method call with x = " + x);
		return result;
	}

}
