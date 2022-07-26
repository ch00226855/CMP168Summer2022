package week2day2;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(1234, "Alice");
		Student s2 = new Student(2234, "Bob");
		
		System.out.println(s1.compareTo(s2));
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s2);
		studentList.add(s1);
		Collections.sort(studentList);
		System.out.println(studentList.toString());

	}

}
