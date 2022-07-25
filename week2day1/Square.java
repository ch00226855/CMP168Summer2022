package week2day1;
// Task for Alice

public class Square extends Shape {
	
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public double computeArea() {
		return side * side;
	}

}
