package week3day1;

import javax.swing.JFrame; // javax.swing is an important GUI library

public class GUIHelloWorld {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setTitle("Hello World"); // Set the title
		window.setSize(800, 400); // Set width and height
		
		// This statement will make the program exit when
		// the window is closed
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a Canvas object
		Canvas canvas1 = new Canvas();
		window.add(canvas1);

		window.setVisible(true); // Make the window visible

	}

}
