package week3day4;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("test.txt");
			PrintWriter writer = new PrintWriter(file);
			
			System.out.println("test");
			writer.println("test");
			
			writer.flush();
			
			file.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}

}
