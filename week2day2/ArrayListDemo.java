package week2day2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Create an arraylist of Strings
		ArrayList<String> nameList = new ArrayList<String>();
		// Add five names to it
		nameList.add("Brian");
		nameList.add("Evelyn");
		nameList.add("Charlie");
		nameList.add("Douglas");
		nameList.add("Angela");
		// Update one name
		nameList.set(1, "Becky");
		// Remove "Douglas"
		nameList.remove(nameList.indexOf("Douglas"));
		// Sort all names
		Collections.sort(nameList);
		// Print all elements in an array list
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		
		

		System.out.println("=================");
		// Create an array of Strings
		String[] nameAry = new String[10];
		// Add five names to it
		nameAry[0] = "Angela";
		nameAry[1] = "Brian";
		nameAry[2] = "Charlie";
		nameAry[3] = "Douglas";
		nameAry[4] = "Evelyn";
		// Update one name
		nameAry[1] = "Becky";
		// Remove "Douglas"
		int index= -1;
		for (int i = 0; i < nameAry.length; i++) {
			if (nameAry[i].equals("Douglas")) {
				index = i;
				break;
			}
		}
		for (int i = index; i < nameAry.length-1; i++) {
			nameAry[i] = nameAry[i + 1];
		}
		nameAry[nameAry.length - 1] = null;
		// Print all names
		for (int i = 0; i < nameAry.length; i++) {
			System.out.println(nameAry[i]);
		}

	}

}
