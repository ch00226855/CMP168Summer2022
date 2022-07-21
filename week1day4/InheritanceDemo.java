package week1day4;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		Restaurant r1 = new Restaurant();
		r1.setName("McDonnald's");
		r1.setAddress("123 4th Avenue");
		r1.getDescription();
		
		r1.setRating(7);
		r1.printRating();
		
	}

}
