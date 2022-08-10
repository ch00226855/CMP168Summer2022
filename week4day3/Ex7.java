
public class Ex7 {
	
	public static int getFibbonacciNumber(int k) {
		// base cases
		if (k == 0) {
			return 0;
		}
		
		if (k == 1) {
			return 1;
		}
		

		// make recursive call
		return getFibbonacciNumber(k-1) + getFibbonacciNumber(k-2);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(getFibbonacciNumber(i));
		}
	}

}
