package week2day1;
// Task for you

public class ShapesDemo {

	public static void main(String[] args) {
		
		Square s1 = new Square(2);
		Circle c1 = new Circle(3);
		
		System.out.println(s1.computeArea());
		System.out.println(c1.computeArea());
		
		// You want to put all the shape objects in an array
		Shape[] ary = {s1, c1};
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i].computeArea());
			ary[i].print();
		}

	}

}
