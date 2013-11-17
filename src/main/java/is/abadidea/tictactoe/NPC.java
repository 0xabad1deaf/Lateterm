package is.abadidea.tictactoe;

import java.util.Random;

public class NPC extends Player{

    private Random rng;

    public NPC(){
        rng = new Random();
        wins = 0;
    }

    public int random_coord(){
        return rng.nextInt(3);
    }
}
