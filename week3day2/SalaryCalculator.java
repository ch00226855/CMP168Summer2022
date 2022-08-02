package week3day2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SalaryCalculator extends JFrame implements ActionListener{
	
	// Declare all components as member variables
	private JLabel label1;
	private JLabel label2;
	private JTextField field1;
	private JTextField field2;
	private JButton button1;
//	private int clickCount = 0;
	
	public SalaryCalculator() {
		// Create these components in a constructor
		label1 = new JLabel("Hourly wage: ");
		label1.setPreferredSize(new Dimension(100, 50));
		label2 = new JLabel("Yearly salary: ");
		label2.setPreferredSize(new Dimension(100, 50));
		field1 = new JTextField("0", 15);
		field2 = new JTextField("", 15);
		button1 = new JButton("Calculate");
		button1.addActionListener(this);
		
		// Add all components to this JFrame
		// Let's experiment with different layout managers
//		FlowLayout layout = new FlowLayout();
//		GridLayout layout = new GridLayout(3, 2);
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout); // Assign layout to the JFrame!!
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets = new Insets(10, 10, 10, 10);
		this.add(label1, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.insets = new Insets(10, 10, 10, 10);
		this.add(field1, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.insets = new Insets(10, 10, 10, 10);
		this.add(label2, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.insets = new Insets(10, 10, 10, 10);
		this.add(field2, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.insets = new Insets(10, 10, 10, 10);
		this.add(button1, constraints);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		clickCount++;
//		System.out.println("Button click: " + clickCount);
//		field2.setText("Button is clicked!");
//		label2.setText("Something happened");
		// Get the value from field1
		String userInput = field1.getText();
		double hourlyWage = Double.parseDouble(userInput);
		
		// Calculate the yearly salary
		double yearlySalary = hourlyWage * 2000;
		
		// Display the yearly salary in field2
		field2.setText("" + yearlySalary); // "" + number will convert the number to a string
		field2.setText(String.format("$%.2f", yearlySalary));
		
	}
	
	


}
