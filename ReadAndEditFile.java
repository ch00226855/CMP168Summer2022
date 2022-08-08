import java.io.*;
import java.util.Scanner;

public class ReadAndEditFile {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String fileName = null;
		FileInputStream inputFile = null;
		Scanner inputScanner = null;
		FileOutputStream outputFile = null;
		PrintWriter writer = null;
		
		while(true) {
			System.out.println("What is the name of your file?");
			fileName = keyboard.nextLine();
			
			try {
				inputFile = new FileInputStream(fileName);
				inputScanner = new Scanner(inputFile);
				
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File Not Found " + fileName);
			}
		}
		
		try {
			outputFile = new FileOutputStream("HomeworkOutput6-2.txt");
			writer = new PrintWriter(outputFile);

			// File name: Homework6-2InputFile.txt
			String line = null;
			String newLine = null;
			while (inputScanner.hasNext()) {
//			System.out.println(inputScanner.nextLine());

				line = inputScanner.nextLine();
//			System.out.println("BEFORE: " + line);
				// 1. remove duplicated spaces
				// repeatedly replace double spaces with a single space, until there is no
				// double spaces
				while (line.indexOf("  ") != -1) {// as long as double spaces exist
					line = line.replaceAll("  ", " ");
				}

//			line = line.replaceAll("\\s+", " "); 
				// \s+ is a regular expression representing 1 or more spaces

				// 2. capitalize the first letter of each sentence
				// Since there is only one space after ., we should capitalize the second
				// character after .
				newLine = "";
				int indexToCapitalize = -1;
				for (int i = 0; i < line.length(); i++) {
					if (i == 0) {// capitalize the first letter of the line
						newLine += Character.toUpperCase(line.charAt(i));
					} else if (line.charAt(i) == '.') {// captialize the character at i+2
						indexToCapitalize = i + 2;
						newLine += line.charAt(i);
					} else if (i == indexToCapitalize) {
						newLine += Character.toUpperCase(line.charAt(i));
					} else {
						newLine += line.charAt(i);
					}

				}

//			System.out.println("AFTER : " + newLine);
				writer.println(newLine);

			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
		

		
		
		keyboard.close();
		if (inputScanner != null) {
			inputScanner.close();
		}

	}

}
