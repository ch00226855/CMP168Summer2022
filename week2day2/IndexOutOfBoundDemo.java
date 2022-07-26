package week2day2;

public class IndexOutOfBoundDemo {

	public static void main(String[] args) {
		
		int[] ary = {1, 2, 3, 4, 5, 6};
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(ary[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index is out of bound!");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			
			try {
				System.out.println(ary[i]);
			} catch (Exception e) {
				System.err.println("Error!");
			}
			
		}

	}

}
