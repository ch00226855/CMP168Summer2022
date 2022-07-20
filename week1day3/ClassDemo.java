package week1day3;

public class ClassDemo {

	public static void main(String[] args) {
		
		// Create a restaurant
		Restaurant r1 = new Restaurant("Burger King", 8);
		Restaurant r2 = new Restaurant("Wendy's", 6);
		Restaurant r3 = new Restaurant("Shake n' Shack", -5);
		
		System.out.println(r1.getName()); // Burger King
		
		// We cannot print the name variable directly.
//		System.out.println(r1.name);

		r1.printInfo();
		r3.printInfo();
		
		r1.setName("Burger Queen");
		r1.setRating(25);
		r1.printInfo();
		
		System.out.println(r1.getName()); // Burger Queen
		System.out.println(r1.getRating());
		
		System.out.println(r1.getRestaurantID());
		System.out.println(r2.getRestaurantID());
		System.out.println(r3.getRestaurantID());
		
//		System.out.println(Restaurant.count);
		System.out.println(Restaurant.getCount());
	}

}
