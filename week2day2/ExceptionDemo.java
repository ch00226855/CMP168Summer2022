package week2day2;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			Person p1 = new Person("Alex", 1980, 185.5, 'f');
			System.out.println(p1.toString());
		} catch (InvalidWeightException error) {
			System.out.println("p1 cannot be created because of an invalid weight.");
		} catch (InvalidGenderException e) {
			System.out.println("P1 cannot be created becasue of an invalid gender.");
		} catch (Exception e) {
			System.out.println("Some other exception occured.");
		} finally {
			System.out.println("Do something after exception handling.");
		}
		
		try {
			Person p2 = new Person("Beth", 1985, -145.5, 'f');
			System.out.println(p2.toString());
		} catch (Exception error) {
			System.out.println("p2 cannot be created");
			System.out.println(error.getMessage());
			error.printStackTrace();
		}
		
		System.out.println("All Done.");
	}

}
