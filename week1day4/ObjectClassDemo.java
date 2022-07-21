package week1day4;

public class ObjectClassDemo {

	public static void main(String[] args) {
		
		// The default behavior of toString() and equals()
		Business b1 = new Business("Grocery Store", 
				"1234, 5th Avenue");
		System.out.println(b1.toString());
		
		Business b2 = new Business("Grocery Store",
				"1234, 5th Avenue");
		System.out.println(b1.equals(b2));
		
		Business b3 = b1;
		System.out.println(b1.equals(b3));
		
		// The String class has rewritten these methods.
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.toString());
		
		// Use overriden methods from Restaurant class
		Restaurant r1 = new Restaurant("Chipotle", "123", 8);
		System.out.println(r1.toString());
		
		Restaurant r2 = new Restaurant("Chipotle", "123", 8);
		System.out.println(r1.equals(r2));

	}

}
