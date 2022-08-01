package week3day1;

import java.awt.*; // import the entire library
import javax.swing.*;

public class PacMan extends JComponent {
	
	// This ID is just to remove a warning Eclipse has.
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		
		// Draw the background
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 400, 400);
		
		// Draw Pac Man's head
		g.setColor(Color.PINK);
		g.fillOval(20, 20, 360, 360);
		// Create the mouth
		g.setColor(Color.GRAY);
		g.fillArc(20, 20, 361, 361, -30, 60);
		
		// Draw Pac Man's eye
		Color purple = new Color(255, 0, 255);
		g.setColor(purple);
		g.fillOval(200, 80, 60, 60);
		
		// Draw string "Pac Man" at the bottom.
		g.setColor(new Color(123, 223, 3));
		g.setFont(new Font("Monospaced", Font.ITALIC, 30));
		g.drawString("Pac Man", 130, 300);
			
	}

}
