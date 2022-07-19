package week1day2;

import java.util.Arrays;

public class PrimitiveTypeDemo {
	
	public static void doSomething(int x) {
		
		x = 100;
		
	}
	
	public static void doSomething(int[] ary) {
		
		ary[0] = 100;
		
	}
	
	public static void main(String[] args) {
		
		int x = 5;
		doSomething(x);
		System.out.println("Value of x: " + x);
		
		int[] myArray = {1, 2, 3};
		doSomething(myArray);
		System.out.println(Arrays.toString(myArray));
		
	}

}
