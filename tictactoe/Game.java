import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class Game extends JFrame implements ActionListener {
	
	private JButton[][] gameBoard;
	private GameInfo gameInfo;
	private Grid grid;
	
	public Game(String player1Name, String player2Name) {
		gameInfo = new GameInfo(player1Name, player2Name);
		grid = new Grid();
		
		// Iterate through gameBoard, create each button
		gameBoard = new JButton[3][3];
		
		// Use GridLayout(3, 3).
		this.setLayout(new GridLayout(3, 3));
		
		for (int row = 0; row < gameBoard.length; row++) {
			for (int col = 0; col < gameBoard[row].length; col++) {
				gameBoard[row][col] = new JButton(" ");
				gameBoard[row][col].setFont(new Font("mono spaced", Font.PLAIN, 100));
				this.add(gameBoard[row][col]);
				gameBoard[row][col].addActionListener(this);
			}
		}
	}
	
	public static void main(String[] args) {
//		Scanner scnr = new Scanner(System.in);
//		System.out.println("Enter Player 1 Name:");
//		String player1Name = scnr.nextLine();
//		System.out.println("Enter Player 2 Name:");
//		String player2Name = scnr.nextLine();
		
		String player1Name = "Alice";
		String player2Name = "Bob";
		
		Game window = new Game(player1Name, player2Name);
		
//		window.pack();
		window.setSize(600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		// Find out the row and column index of the button being clicked.
		// e.getSource() -> the object that triggers this event
		int rowClicked = -1;
		int colClicked = -1;
		
		for (int row = 0; row < gameBoard.length; row++) {
			for (int col = 0; col < gameBoard[row].length; col++) {
				if (gameBoard[row][col].equals(e.getSource())) {
					rowClicked = row;
					colClicked = col;
				}
			}
		}
		
		// Update the grid and gameInfo using either player1Move() or player2Move()
		if (gameInfo.getCurrentPlayer().equals(gameInfo.getPlayer1Name())) {
			grid.player1Move(rowClicked, colClicked);
		} else {
			grid.player2Move(rowClicked, colClicked);
		}
		gameInfo.updateCurrentPlayer();
	
		
		// Update the view
		updateView();
		
		// Update the game state
		gameInfo.setGameState(grid.updateGameState());
		if (!gameInfo.getGameState().equals("Not Finished")) {
			String message;
			if (gameInfo.getGameState().equals("Player1 wins")) {
				message = "Player 1 wins the game!";
			} else if (gameInfo.getGameState().equals("Player2 wins")) {
				message = "Player 2 wins the game!";
			} else {
				message = "The game ends with a tie!";
			}
			
			int response = JOptionPane.showConfirmDialog(this, message + "\n New game?", "Game Over",
					JOptionPane.YES_NO_OPTION);
			if (response == JOptionPane.NO_OPTION) {
				System.exit(0);
			} else {
				gameInfo.gameOver();
				grid.resetGrid();
				updateView();
			}
		}
	}
	
	private void updateView() {
		for (int row = 0; row < gameBoard.length; row++) {
			for (int col = 0; col < gameBoard[row].length; col++) {
				gameBoard[row][col].setText("" + grid.getGrid()[row][col]);
			}
		}
	}

}
