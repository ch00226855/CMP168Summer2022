package week3day1;

import javax.swing.JFrame;

public class PacManFrame {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Pac Man");
		
		PacMan p1 = new PacMan();
		window.add(p1);
		
		
		
		
		window.setSize(600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
