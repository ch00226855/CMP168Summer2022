package week3day2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextWindow {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Salary");
		
//		JLabel label1 = new JLabel("An hourly wage of 20/hr yields $40000/year.");
//		window.add(label1);
		
		JTextField field1 = new JTextField("An hourly wage of 20/hr yields $40000/year.");
		field1.setColumns(40);
		field1.setEditable(false);
		window.add(field1);
		
//		window.setSize(500, 100);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
