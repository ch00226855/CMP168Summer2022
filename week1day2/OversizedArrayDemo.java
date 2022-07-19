package week1day2;

public class OversizedArrayDemo {

	public static void main(String[] args) {
		
		String[] names = new String[100];
		int size = 0;
		
		names[size] = "Alice";
		size++;
		
		names[size] = "Bob";
		size++;
		
		names[size] = "Clare";
		size++;
		
		names[size] = "David";
		size++;
		
		names[size] = "Eva";
		size++;
		
		// How can I print all names?
		for (int i = 0; i < size; i++) {
			System.out.println(names[i]);
		}
		
		

	}

}
