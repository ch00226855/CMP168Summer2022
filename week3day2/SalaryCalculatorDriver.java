package week3day2;

import javax.swing.JFrame;

public class SalaryCalculatorDriver {

	public static void main(String[] args) {
		
		SalaryCalculator window = new SalaryCalculator();
		
//		window.setSize(400, 220);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
