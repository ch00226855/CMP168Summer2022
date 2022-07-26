package week2day2;

public class Person {
	
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	
	public Person(String name,
					int birthYear,
					double weight,
					char gender) throws InvalidWeightException,
										InvalidGenderException {
		this.name = name;
		this.birthYear = birthYear;
		
		if (weight < 0) {
			InvalidWeightException error = new InvalidWeightException("weight = " + weight);
			throw error;
		}
		this.weight = weight;

		// Handling the expection here is not the best approach.
		// We want to stop this object from being created.
//		catch (Exception e) {
//			System.out.println("Invalid weight is entered.");
//		}
		
		if (gender == 'f' || gender == 'm') {
			this.gender = gender;
		} else {
			throw new InvalidGenderException("gender = " + gender);
		}
	}
	
	@Override
	public String toString() {
		return this.name + this.birthYear;
	}

}
