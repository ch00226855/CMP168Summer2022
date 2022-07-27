package week2day3;

/*
 * - numDogs : int 0 // static controlled variable initial value = 0

- dogID: int // controlled variable dependent upon numDogs

+ getNumDogs() : int // static method

+ getDogID() : int
 */

public class Dog {
	


	private static int numDogs = 0; // Initialize a static variable right away
	
	private String name;
	private double weight;
	private double height;
	private boolean isVaccinated;
	private int ageInDogYear;
	private int dogID;
	
	public Dog() {
		name = ""; // Or: this.name = "";
		weight = 0.0;
		height = 0.0;
		isVaccinated = false;
		ageInDogYear = 0;	
		
		numDogs++;
		dogID = numDogs;
	}
	
	
	public Dog(String name) {
		this(); // call the default constructor to assign a default value to all member variables.
		this.name = name;
	}
	
	public Dog(String name, double weight, double height) {
		this(name);
		
		if (isValid(weight)) {
			this.weight = weight;
		} else {
			this.weight = 0.0;
		}
		
		if (isValid(height)) {
			this.height = height;
		} else {
			this.height = 0.0;
		}
	}
	
	public Dog(String name,
			double weight,
			double height,
			boolean isVaccinated,
			int age) {
		this(name, weight, height); // call the previous constructor
		this.isVaccinated = isVaccinated;
		
		if (isValid(age)) {
			this.ageInDogYear = age;
		} else {
			this.ageInDogYear = 0;
		}
	}
	

	
	public void speak() {
		System.out.println("Woof!");
	}
	
	public void sit() {
		System.out.println("Sit!");
	}
	
	public void growTaller() {
		this.height += 1;
	}
	
	public void growTaller(double growthAmount) {
		if (isValid(growthAmount)) {
			this.height += growthAmount;
		}
	}
	
	@Override
	// @Override means that this class already has a toString() method, but we are going to 
	// use a new implementation.
	public String toString() {
		return String.format("Name: %10s, Age: %3d, Weight %7.1f, Height %7.1f,  Is Vanccinated? %b", 
				this.name, this.ageInDogYear, this.weight, this.height, this.isVaccinated);
	}
	
	@Override
	public boolean equals(Object obj) {
		double precisionThreshold = 0.001;
		if(obj instanceof Dog) {
			Dog dObj = (Dog) obj;
			if (this.name.equals(dObj.name) &&
				this.isVaccinated == dObj.isVaccinated &&
				this.ageInDogYear == dObj.ageInDogYear &&
				Math.abs(this.weight - dObj.weight) < precisionThreshold &&
				Math.abs(this.height - dObj.height) < precisionThreshold) {
				return true;
			}
		}
		return false;
	}
	
	
	private boolean isValid(double x) {
		return (x >= 0);
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public int getAgeInDogYear() {
		return ageInDogYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public void setAgeInDogYear(int ageInDogYear) {
		this.ageInDogYear = ageInDogYear;
	}
	
	public static int getNumDogs() {
		return numDogs;
	}


	public int getDogID() {
		return dogID;
	}
}
