package week1day3;

public class Restaurant {
	
	// The static variable is created once for this class.
	// It is shared among all objects from this class.
	private static int count = 0;
	
	// 1. member variables 
	// (a group of member variables are created for each object)
	private String name;
	private int rating;
	private int restaurantID;
	
	// 2. constructor(s)
	// The default constructor
	public Restaurant() {
		name = "No Name Given";
		rating = 0;
		restaurantID = 10000 + count;
		count++;
	}
	
	// The overloaded constructors
	public Restaurant(String name, int restaurantRating) {
		// assign the parameter values to corresponding member variables.
		this.name = name;
		
		// Check if the rating is valid.
		if (isValidRating(restaurantRating)) {
			this.rating = restaurantRating;
		} else {
			System.out.println("Invalid restaurant rating was given.");
			this.rating = 0;
		}
		restaurantID = 10000 + count;
		count++;
	}
	
	
	// 3. methods
	public void printInfo() {
		System.out.println("Name: " + name + " | Rating: " +
							rating);
	}
	
	// mutator methods (setter methods)
	public void setName(String name) {
		// Assign the new name to the name variable
		this.name = name;
	}
	
	public void setRating(int rating) {
		if (isValidRating(rating)) {
			this.rating = rating;
		} else {
			System.out.println(rating + " is invalid. Cannot update the rating.");
		}
	}
	
	// accessor methods (getter methods)
	public String getName() {
		return this.name;
	}
	
	public int getRating() {
		return rating;
	}
	
	
	public int getRestaurantID() {
		return restaurantID;
	}

	// helper methods
	private boolean isValidRating(int rating) {
		return (rating >= 0 && rating <= 10);
	}
	
	public static int getCount() {
		return count;
	}
	

}
