package is.abadidea.tictactoe;

public class Game {

	public boolean gameType;
    public boolean full;
    public int winner;
	public Grid grid;
	public Player player1;
	public Player player2;
	public Player currentPlayer;

	public Game(boolean typeOfGame)
	{
		gameType = typeOfGame;
        winner = 0;
        this.full = false;
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

    public boolean hasEntry(int x, int y){
        return(grid.matrix[x][y] != 0);
    }

    public boolean gridFull()
    {
        boolean full = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                if(grid.matrix[i][j] == 0)
                {
                    full = false;
                }
            }
        }
        return full;
    }
    
    public void playRound(int x, int y){
    	boolean win = false;
        boolean success = false;
        if(gameType){
            while(!hasEntry(x,y)){ // user must insert into empty cell
                grid.set_x(x,y);
            }
            if(!(win = gotWinner()))
                do{
                    success = playNPC();
                } while(!success);

        } else {
            if(currentPlayer == player1){
                while(!hasEntry(x,y)){ // user must insert into empty cell
                    grid.set_x(x,y);
                }
                if(!(win = gotWinner()))
                	switchPlayer();
            } else {
                while(!hasEntry(x,y)){ // user must insert into empty cell    
                    grid.set_o(x,y);
                }
                if(!(win = gotWinner()))
                	switchPlayer();
            }
        }
        if(win){
            if(currentPlayer == player1){
                this.winner = 1;
            } else {
                this.winner = 2;
            }
        }
        this.full = gridFull();
    }

    private boolean playNPC(){
        int a = ((NPC)player2).random_coord(), b = ((NPC)player2).random_coord();
        return grid.set_o(a,b);
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
        String full = "\"full\": " + this.full;
        String json = "{ \"wins\": " + wins + ", \"matrix\": " + grid.toJson() + ", " + full + ", \"win\": " + this.winner + " }";
        return json;
    }

}
