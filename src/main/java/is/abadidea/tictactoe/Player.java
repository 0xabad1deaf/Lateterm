package is.abadidea.tictactoe;

public abstract class Player {

    protected int wins;

    public Player(){
        wins = 0;
    }

    public int getWins(){
        return wins;
    }
    public int random_coord(){
        return 0;
    }
}
