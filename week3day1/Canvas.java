package week3day1;

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JComponent;

public class Canvas extends JComponent {
	
	public Canvas() {
		this.setSize(400, 400);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		g.fillRect(0,  0, 400, 400);

		g.setColor(Color.PINK);
		g.fillRect(50, 60, 150, 100);
		
		g.setColor(Color.WHITE);
		g.drawRect(150, 100, 100, 200); // x, y, width, height
		
	}

}
