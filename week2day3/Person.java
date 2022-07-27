package week2day3;


public abstract class Person {
	
	private String name;
	private int birthYear;
	
	public Person() {
		name = "";
		birthYear = 0;
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public abstract void work(); // We don't need to provide implementation here.

}
