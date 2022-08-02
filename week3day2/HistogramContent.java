package week3day2;

import java.awt.*;
import javax.swing.*;

public class HistogramContent extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		
		// It's a good habit to cast g to a Graphics2D object or a Graphics3D object.
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(new Color(105, 117, 60));
		g2D.fillRect(20, 20, 400, 120);
		
		g2D.setColor(Color.CYAN);
		g2D.fillRect(20, 160, 350, 120);
		
		g2D.setColor(Color.GRAY);
		g2D.fillRect(20, 300, 600, 120);
		
	}

}
