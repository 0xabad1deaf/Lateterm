package is.abadidea.tictactoe;

import java.util.Random;

public class NPC {

    private Random rng;

    public NPC(){
        rng = new Random();
    }

    public int random_coord(){
        return rng.nextInt(3);
    }
}

