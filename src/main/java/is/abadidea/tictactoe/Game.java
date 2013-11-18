package is.abadidea.tictactoe;

public class Game {

	public boolean gameType;
	public Grid grid;
	public Player player1;
	public Player player2;
	public Player currentPlayer;

	public Game(boolean typeOfGame)
	{
		gameType = typeOfGame;
		grid = new Grid();
		this.player1 = new Player();
		if(gameType)
		{
			this.player2 = new NPC();

		}
		else
		{
			this.player2 = new Player();
		}
		currentPlayer = player1;
	}

	public boolean gotWinner(){
		
		if(0 != grid.matrix[0][0] && grid.matrix[0][0] == grid.matrix[0][1] && grid.matrix[0][0] == grid.matrix[0][2])
			return true;
		if(0 != grid.matrix[0][0] && grid.matrix[0][0] == grid.matrix[1][1] && grid.matrix[0][0] == grid.matrix[2][2])
			return true;
		if(0 != grid.matrix[0][0] && grid.matrix[0][0] == grid.matrix[1][0] && grid.matrix[0][0] == grid.matrix[2][0])
			return true;
		if(0 != grid.matrix[0][1] && grid.matrix[0][1] == grid.matrix[1][1] && grid.matrix[0][1] == grid.matrix[0][2])
			return true;
		if(0 != grid.matrix[0][2] && grid.matrix[0][2] == grid.matrix[1][2] && grid.matrix[0][2] == grid.matrix[2][2])
			return true;
		if(0 != grid.matrix[1][0] && grid.matrix[1][0] == grid.matrix[1][1] && grid.matrix[1][0] == grid.matrix[1][2])
			return true;
		if(0 != grid.matrix[2][0] && grid.matrix[2][0] == grid.matrix[2][1] && grid.matrix[2][0] == grid.matrix[2][2])
			return true;
		if(0 != grid.matrix[0][2] && grid.matrix[0][2] == grid.matrix[1][1] && grid.matrix[0][2] == grid.matrix[2][0])
			return true;

		return false;
	}	
    
    public void playRound(int x, int y){
        if(gameType){
            grid.set_x(x,y);
            grid.set_o(player2.random_coord(), player2.random_coord());
        } else {
            grid.set_x(x,y);
            switchPlayer();
        }
    }

    public void switchPlayer(){
        if(currentPlayer == player1){
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

}
