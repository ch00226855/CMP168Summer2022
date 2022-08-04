package week3day4;

public class Person {
	
	private String name;
	private char gender;
	private int age;
	
	public Person() {
		name = "";
		gender = 'u';
		age = 0;
	}
	
	public Person(String name) {
		this();
		this.name = name;
	}
	
	public Person(String name, char gender, int age) {
		this(name);
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person: " + name + "," + gender + "," + age;
	}
}
