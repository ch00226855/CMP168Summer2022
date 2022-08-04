package week3day4;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonDatabase {

	public static void main(String[] args) {
		
		System.out.println("Current working directory: " + System.getProperty("user.dir"));
		
		Scanner keyboard = new Scanner(System.in);
		int userChoice;
		ArrayList<Person> database = new ArrayList<Person>();
		
		// Create the database from file database.txt
		
		// Ask user to create new objects
		outerloop:
		while(true) {
			userChoice = -1;
			
			displayMenu();
			
			System.out.println("Choose an option:");
			userChoice = keyboard.nextInt();
			keyboard.nextLine(); // waste the remaining part of the line.
			
			switch(userChoice) {
			case 1: 
				addPerson(database, keyboard);
				break; // We must use break at the end of each case.
			case 2:
				displayDatabase(database);
				break;
			case 3:
				System.out.println("Exiting...");
				saveDatabase(database);
				break outerloop;
			default:
				System.out.println("Invalid option.");
				break;
			}
		}
	}
	
	public static void displayMenu() {
		System.out.println("=====================================");
		System.out.println("== 1. Add a new person to database ==");
		System.out.println("== 2. Display the database         ==");
		System.out.println("== 3. Exit the system              ==");
		System.out.println("=====================================");
	}
	
	public static void addPerson(ArrayList<Person> database, Scanner keyboard) {
		System.out.println("Enter name:");
		String name = keyboard.nextLine();
		System.out.println("Enter gender:");
		char gender = keyboard.nextLine().charAt(0);
		System.out.println("Enter age:");
		int age = keyboard.nextInt();
		keyboard.nextLine(); // waste the remaining part of the line.
		Person p = new Person(name, gender, age);
		database.add(p);
	}
	
	public static void displayDatabase(ArrayList<Person> database) {
		for (int i = 0; i < database.size(); i++) {
			System.out.println(database.get(i).toString());
		}
	}
	
	public static void saveDatabase(ArrayList<Person> database) {
		try {
			FileOutputStream file = new FileOutputStream("data.txt");
			PrintWriter writer = new PrintWriter(file);
			
			for (int i = 0; i < database.size(); i++) {
				System.out.println("Printing:");
				System.out.println(database.get(i).toString());
				writer.println(database.get(i).toString());
			}
			
			writer.flush();
			
			file.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}

}
