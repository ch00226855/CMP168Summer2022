package week3day4;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

public class FileInputDemo {

	public static void main(String[] args) {
		
		String line = null;
		String classType = null;
		String param1 = null;
		String param2 = null;
		String param3 = null;
		String param4 = null;
		
		// Read a file I downloaded from Project 1.
		try {
//			FileInputStream file = new FileInputStream("C:/Users/lzhao/Downloads/Project 1 (Optional) - School Database/SchoolDB_Initial.txt");
			FileInputStream file = new FileInputStream("data.txt");
			Scanner scnr = new Scanner(file);
			while (scnr.hasNext()) {
				classType = null;
				param1 = null;
				param2 = null;
				param3 = null;
				param4 = null;
				
				line = scnr.nextLine();
				
				if (line.equals("")) {
					continue;
				}
				
				classType = line.split(":")[0].strip();
				
				try {
					String[] params = line.split(":")[1].split(",");
//					System.out.println(Arrays.toString(params));
					
					param1 = params[0].strip();
					param2 = params[1].strip();
					param3 = params[2].strip();
					param4 = params[3].strip();
				} catch (Exception e) {
//					System.out.println(e.getMessage());
				}
				
				System.out.println("Class Type: "  + classType);
				System.out.println("Parameters: " + param1 + "-" + param2 + "-" + param3 + "-" + param4);
				
				// If the class type is a person, construct the object
				if (classType.equals("Person")) {
					Person p = new Person(param1, param2.charAt(0), Integer.parseInt(param3));
					System.out.println("Person created.");
					System.out.println(p.toString());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
