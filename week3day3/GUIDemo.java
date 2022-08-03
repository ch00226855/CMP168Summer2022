package week3day3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUIDemo extends JFrame implements ActionListener, ChangeListener {
	
	double driveSpeed;
	double airplaneSpeed;
	
	// Declare GUI components
	private JLabel distLabel;
	private JLabel flyLabel;
	private JLabel driveLabel;
//	private JTextField distField; // change it to a JFormattedTextField
	private JFormattedTextField distField;
	private JTextField flyField;
	private JTextField driveField;
	private JButton button;
	
	// Add a JSpinner in a new row, so that the user can specify the driving speed.
	private JLabel driveSpeedLabel;
	private JSpinner driveSpeedSpinner;
	
	// Add a JTextArea on Row 2 to show the speed of plane and car
	private JTextArea speedArea;
	
	// Add a table to display the last calculation
	private String[] columnHeadings;
	private String[][] tableVals;
	private JTable historyTable;
	
	// Add a slider for airplane speed
	private JLabel airplaneSpeedLabel;
	private JSlider airplaneSpeedSlider;
	
	
	public GUIDemo() {
		driveSpeed = 60.0;
		airplaneSpeed = 500.0;
		
		// create GUI components
		distLabel = new JLabel("Distance: ");
		flyLabel = new JLabel();
		flyLabel.setText("Flight Time: ");
		driveLabel = new JLabel("Driving Time: ");
		
//		distField = new JTextField();
		distField = new JFormattedTextField(NumberFormat.getNumberInstance());
		distField.setText("0");
		distField.setColumns(10);
		
		flyField = new JTextField("0", 10);
		flyField.setEditable(false);
		driveField = new JTextField("0", 10);
		driveField.setEditable(false);
		
		button = new JButton("Calculate");
		button.addActionListener(this);
		
		driveSpeedLabel = new JLabel("Driving Speed: ");
		SpinnerNumberModel spinnerModel = new SpinnerNumberModel(60, 0, 100, 5);
	    driveSpeedSpinner = new JSpinner(spinnerModel);
	    driveSpeedSpinner.addChangeListener(this);
	    
	    speedArea = new JTextArea(4, 15);
	    speedArea.setText("Airplane speed: " + airplaneSpeed + "\n" +
	    				"Car speed: " + driveSpeed);
	    speedArea.setEditable(false);
	    
	    columnHeadings = new String[] {"Distance", "Flying Time", "Driving Time"};
	    tableVals = new String[1][3];
	    historyTable = new JTable(tableVals, columnHeadings);
	    historyTable.setEnabled(false);
	    
	    airplaneSpeedLabel = new JLabel("Airplane Speed: ");
	    airplaneSpeedSlider = new JSlider(500, 600, 500);
	    airplaneSpeedSlider.addChangeListener(this); // Use HeightConverter's stateChanged()
	    airplaneSpeedSlider.setMajorTickSpacing(20);
	    airplaneSpeedSlider.setMinorTickSpacing(5);
	    airplaneSpeedSlider.setPaintTicks(true);
	    airplaneSpeedSlider.setPaintLabels(true);
		
		
		// add GUI components to "this"
		this.setLayout(new GridBagLayout());
		GridBagConstraints layoutConst;
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 10, 10);
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		add(distLabel, layoutConst);
		
		layoutConst.gridx = 1;
		add(distField, layoutConst);
		
		layoutConst.gridx = 2;
		add(button, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		add(flyLabel, layoutConst);
		
		layoutConst.gridx = 2;
		add(driveLabel, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		add(flyField, layoutConst);
		
		layoutConst.gridx = 2;
		add(driveField, layoutConst);
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 3;
		add(driveSpeedLabel, layoutConst);
		
		layoutConst.gridx = 1;
		add(driveSpeedSpinner, layoutConst);
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		layoutConst.gridheight = 2;
		add(speedArea, layoutConst);
		layoutConst.gridheight = 1; // Don't forget to change it back
		
		// Add table header to Row 5
		layoutConst.gridx = 0;
		layoutConst.gridy = 6;
		layoutConst.gridwidth = 3;
		add(historyTable.getTableHeader(), layoutConst);
		
		// Add table body to Row 6
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 7;
		layoutConst.gridwidth = 3;
		add(historyTable, layoutConst);
		
		// Add airplane speed slider to Row 7
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 8;
		add(airplaneSpeedLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 1;
		layoutConst.gridy = 8;
		add(airplaneSpeedSlider, layoutConst);
	}
	
	

	public static void main(String[] args) {
		
		GUIDemo window = new GUIDemo();
		
		window.setTitle("Time Calculator");
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}



	@Override
	public void actionPerformed(ActionEvent event) {
		
		// How can we determine it is the button that is being clicked?
		if (button.equals(event.getSource())) {
			// Get values from user input
			double input = 0.0;
			
//			try {
//				input = Double.parseDouble(distField.getText());
//				
//				if (input < 0.0) {
//					JOptionPane.showMessageDialog(this, "User input is invalid!");
//				}
//				
//			} catch (Exception e) {
////				System.out.println("User input is invalid!");
//				 JOptionPane.showMessageDialog(this, "User input is invalid!");
//			}
			
			try {
				input = ((Number) distField.getValue()).doubleValue();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "User input is invalid!");
			}

			
			if (input < 0.0) {
				JOptionPane.showMessageDialog(this, "User input is invalid!");
			}
			
			// Do calculation
			double flyTime = input / airplaneSpeed;
			double driveTime = input / driveSpeed;
			
			// Display the results
			flyField.setText(String.format("%.2f", flyTime));
			driveField.setText(String.format("%.2f", driveTime));
			
			// Update the table
			tableVals[0][0] = "" + input;
			tableVals[0][1] = "" + flyTime;
			tableVals[0][2] = "" + driveTime;
			historyTable.repaint();
		} 
		

		
	}



	@Override
	public void stateChanged(ChangeEvent e) {
		
		if (driveSpeedSpinner.equals(e.getSource())) {
			driveSpeed = ((Number) driveSpeedSpinner.getValue()).doubleValue();
		}
		
		if (airplaneSpeedSlider.equals(e.getSource())) {
			airplaneSpeed = airplaneSpeedSlider.getValue();
		}
		
		// Update the speed values in the text area
		speedArea.setText("Airplane speed: " + airplaneSpeed + "\n" +
				"Car speed: " + driveSpeed);
		
	}

}
