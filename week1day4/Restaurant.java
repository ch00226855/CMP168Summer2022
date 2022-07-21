package week1day4;

public class Restaurant extends Business {

	private int rating;
	
	public Restaurant() {
		super();
		rating = 0;
	}
	
	public Restaurant(String name, String address,
						int rating) {
		// Trick: use the constructor from Business
		super(name, address);
		this.rating = rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void printRating() {
		System.out.println("Rating: " + rating);
	}
	
	public void printRestaurantDescription() {
		System.out.println("Name: " + getName() + ", Address: "
				+ address + ", Rating: " + rating);
	}
	
	// Re-define the getDescription method so that it 
	// prints the rating as well.
	@Override
//	public void getDescription() {
//		System.out.println("Name: " + getName() + ", Address: "
//				+ address + ", Rating: " + rating);
//	}
	public void getDescription() {
		super.getDescription(); // refers to the Business class
		System.out.println("Rating: " + rating);
	}
	
	@Override
	public String toString() {
		return ("|Name: " + getName() + " | Address: "
				+ address + " | Rating: " + rating + "|");
	}
	
	@Override
	public boolean equals(Object a) {
		// 1. check if a is an instance of Restaurant
		// 2. check if a's attributes are the same of this object's
		if (a instanceof Restaurant) {
			// Cast a to a Restaurant object
			Restaurant a2 = (Restaurant) a; 
			if (this.getName().equals(a2.getName())) {
				return true;
			}
		}
		
		return false;
		
	}
}
