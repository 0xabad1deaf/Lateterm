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
    
    public boolean playRound(int x, int y){
    	boolean win = false;
        if(gameType){
            grid.set_x(x,y);
            if(!(win = gotWinner()))
            	grid.set_o(((NPC)player2).random_coord(), ((NPC)player2).random_coord());
        } else {
            System.out.println("pvp mode");
            if(currentPlayer == player1){
                grid.set_x(x,y);
                System.out.println("managed to set x");
                if(!(win = gotWinner()))
                    System.out.println("error here");
                	switchPlayer();
            } else {
                grid.set_o(x,y);
                if(!(win = gotWinner()))
                	switchPlayer();
            }
        }
        return win;
    }

    public void switchPlayer(){
        if(currentPlayer == player1){
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
                
    public String getState(){
        String wins = "{ \"wins1\": " + player1.getWins() + ", \"wins2\": " + player2.getWins() + " }";
        String json = "{ \"wins\": " + wins + ", \"matrix\": " + grid.toJson() + "}";
        return json;
    }

}
