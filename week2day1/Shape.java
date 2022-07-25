package week2day1;

public abstract class Shape {
	
	String name;
	
	public abstract double computeArea();
	
	public void print() {
		System.out.println("This method is define in an abstract class.");
	}

}
