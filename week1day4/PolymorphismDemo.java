package week1day4;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Business b1 = new Business("Grocery Store", 
				"1234, 5th Avenue");
		Restaurant r1 = new Restaurant("Chipotle", "123", 8);
		Restaurant r2 = new Restaurant("KFC", "456", 9);
		
		// Put b1, r1, and r2 to an array
		Business[] ary = {b1, r1, r2};
		
		// Print the description of each object
		for (int i = 0; i < ary.length; i++) {
			ary[i].getDescription();
		}


	}

}
