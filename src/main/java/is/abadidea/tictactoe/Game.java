package is.abadidea.tictactoe;

public class Game {

	public boolean gameType;
	public Grid grid;
	// public Player player1;
	// public Player player2;

	public Game(boolean typeOfGame)
	{
		gameType = typeOfGame;
		grid = new Grid();
		// this.player1 = new Human();
		// if(gameType)
		// {
		// 	this.player2 = new Human();
		// }
		// else
		// {
		// 	this.player2 = new NPC();
		// }

	}
	public boolean gotWinner(){
		
		if(grid.matrix[0][0] == grid.matrix[0][1] && grid.matrix[0][0] == grid.matrix[0][2])
			return true;
		if(grid.matrix[0][0] == grid.matrix[1][1] && grid.matrix[0][0] == grid.matrix[2][2])
			return true;
		if(grid.matrix[0][0] == grid.matrix[1][0] && grid.matrix[0][0] == grid.matrix[2][0])
			return true;
		if(grid.matrix[0][1] == grid.matrix[1][1] && grid.matrix[0][1] == grid.matrix[0][2])
			return true;
		if(grid.matrix[0][2] == grid.matrix[1][2] && grid.matrix[0][2] == grid.matrix[2][2])
			return true;
		if(grid.matrix[1][0] == grid.matrix[1][1] && grid.matrix[1][0] == grid.matrix[1][2])
			return true;
		if(grid.matrix[2][0] == grid.matrix[2][1] && grid.matrix[2][0] == grid.matrix[2][2])
			return true;
		if(grid.matrix[0][2] == grid.matrix[1][1] && grid.matrix[0][2] == grid.matrix[2][0])
			return true;
		else
			return false;

	}	
}
