package week3day2;

import javax.swing.JFrame;

public class HistogramWindow {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Histogram Viewer");
		
		// Add a JComponent as the content.
		HistogramContent comp = new HistogramContent();
		window.add(comp);
		
		window.setSize(800, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

}
