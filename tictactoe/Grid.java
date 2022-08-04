import java.util.Arrays;

public class Grid {
	
	private char[][] grid; // ' ' -> empty, 'X' -> Player1, 'O' -> Player 2
	
	public Grid() {
		grid = new char[3][3];
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = ' ';
			}
		}
	}
	
	public void player1Move(int row, int col) {
		try {
			if (grid[row][col] == ' ') {
				grid[row][col] = 'X';
			} else {
				System.out.println("Cell already marked in Grid.player1Move(): " +
                					row + ", " + col);
			}
		} catch (Exception e) {
			System.out.println("Invalid index for Grid.player1Move(): " +
		                       row + ", " + col);
		}
	}
	
	public void player2Move(int row, int col) {
		try {
			if (grid[row][col] == ' ') {
				grid[row][col] = 'O';
			} else {
				System.out.println("Cell already marked in Grid.player2Move(): " +
                					row + ", " + col);
			}
		} catch (Exception e) {
			System.out.println("Invalid index for Grid.player2Move(): " +
		                       row + ", " + col);
		}
	}
	
	public char[][] getGrid() {
		return grid;
	}

	public String updateGameState() {

		boolean player1Wins = false;
		boolean player2Wins = false;
		boolean isFull = true;
		
		// Check for Player 1
		// Check if one row has 3 identical symbols
		for (int row = 0; row < grid.length; row++) {
			if (grid[row][0] == 'X' && grid[row][1] == 'X' && grid[row][2] == 'X') {
				player1Wins = true;
			}
		}

		// check if one column has 3 identical symbols
		for (int col = 0; col < grid[0].length; col++) {
			if (grid[0][col] == 'X' && grid[1][col] == 'X' && grid[2][col] == 'X') {
				player1Wins = true;
			}
		}

		// check if one diagonal has 3 identical symbols
		if (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') {
			player1Wins = true;
		}
		if (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X') {
			player1Wins = true;
		}

		// check for player 2.
		// Check if one row has 3 identical symbols
		for (int row = 0; row < grid.length; row++) {
			if (grid[row][0] == 'O' && grid[row][1] == 'O' && grid[row][2] == 'O') {
				player2Wins = true;
			}
		}

		// check if one column has 3 identical symbols
		for (int col = 0; col < grid[0].length; col++) {
			if (grid[0][col] == 'O' && grid[1][col] == 'O' && grid[2][col] == 'O') {
				player2Wins = true;
			}
		}

		// check if one diagonal has 3 identical symbols
		if (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') {
			player2Wins = true;
		}
		if (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O') {
			player2Wins = true;
		}
		// check if the board is full
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == ' ') {
					isFull = false;
					break;
				}
			}
		}
		// Decide what to return:
		// "Player1 wins", "Player2 wins", "Tie", "Not Finished"
		if (player1Wins) {
			return "Player1 wins";
		} else if (player2Wins) {
			return "Player2 wins";
		} else if (isFull) {
			return "Tie";
		} else {
			return "Not Finished";
		}
	}
	
	public void resetGrid() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = ' ';
			}
		}
	}
	
	///////////////////////////////////////////
	// For Testing:
	public void printGrid() {
		for (int i = 0; i < grid.length; i++) {
			System.out.println(Arrays.toString(grid[i]));
		}
	}

}
