import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ex5 extends JFrame implements ActionListener {
	
	private JLabel label;
	private JTextField field;
	private JButton button;
	
	public Ex5(String title) {
		
		this.setTitle(title);
		
		label = new JLabel("Counter");
		field = new JTextField("0", 15);
		button = new JButton("Count");
		
		field.setEditable(false);
		button.addActionListener(this);
		
		this.setLayout(new FlowLayout());
		
		this.add(label);
		this.add(field);
		this.add(button);		
	}
	
	public static void main(String[] args) {
		Ex5 window = new Ex5("Swing Counter");
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (button.equals(e.getSource())) {
			int value = Integer.parseInt(field.getText());
			value++;
			field.setText("" + value);
		}
	}

}
