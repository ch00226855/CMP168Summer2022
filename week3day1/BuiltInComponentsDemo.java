package week3day1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BuiltInComponentsDemo extends JFrame implements ActionListener {
	
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	private JTextField field1;
	private JTextField field2;
	
	private JButton button1;
	
	public BuiltInComponentsDemo() {

		
		label1 = new JLabel("This is a JLabel");
		label2 = new JLabel("This is another JLabel");
		label3 = new JLabel("This is yet another JLabel");
		
		field1 = new JTextField(20);
		field2 = new JTextField("This is displayed by default", 20);
		
		button1 = new JButton("OK");	
		button1.addActionListener(this); // IMPORTANT: connect the component with the action listener!!
		
		this.setLayout(new FlowLayout());
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(field1);
		this.add(field2);
		this.add(button1);
	}
	
	public static void main(String[] args) {
		
		BuiltInComponentsDemo window = new BuiltInComponentsDemo();
		
		// We need a layout manager when we add multiple components
//		BorderLayout layout = new BorderLayout(); // NORTH, SOUTH, WEST, EAST, CENTER
//		window.setLayout(layout);
//
//		window.add(label1, BorderLayout.NORTH);
//		window.add(label2, BorderLayout.EAST);
		

		
		// If user enters "Hi" in field1, then display "Hello" in field2.
		
		
		window.setSize(400, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (field1.getText().equals("Hi")) {
			field2.setText("Hello");
		}
	}

}
