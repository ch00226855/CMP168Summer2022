
public class GameInfo {
	
	private String player1Name;
	private String player2Name;
	private int player1Score;
	private int player2Score;
	private int gameCount;
	private String currentPlayer;
	private String gameState; // "Player1 wins", "Player2 wins", "Tie", "Not Finished"
	
	public GameInfo(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
		player1Score = 0;
		player2Score = 0;
		gameCount = 0;
		currentPlayer = player1Name;
		gameState = "Not Finished";
	}
	
	public void updateCurrentPlayer() {
		if (currentPlayer.equals(player1Name)) {
			currentPlayer = player2Name;
		} else {
			currentPlayer = player1Name;
		}
	}
	
	public void gameOver() {
		if (gameState.equals("Not Finished")) {
			System.out.println("GameInfo.gameOver() shouldn't be called!");
		}
		
		if (gameState.equals("Player1 wins")) {
			gameCount++;
			player1Score++;
		}
		
		if (gameState.equals("Player2 wins")) {
			gameCount++;
			player2Score++;
		}
		
		if (gameState.equals("Tie")) {
			gameCount++;
		}
		
		currentPlayer = player1Name;
		gameState = "NotFinished";
	}
	
	
	public String getPlayer1Name() {
		return player1Name;
	}

	public String getPlayer2Name() {
		return player2Name;
	}

	public int getPlayer1Score() {
		return player1Score;
	}

	public int getPlayer2Score() {
		return player2Score;
	}

	public int getGameCount() {
		return gameCount;
	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}

	public String getGameState() {
		return gameState;
	}
	
	public void setGameState(String state) {
		this.gameState = state;
	}

}
