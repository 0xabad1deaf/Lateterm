package is.abadidea.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NPCTest {

    @Test
    public void rndReturnsNumberInRange(){
        NPC computer = new NPC();
        for(int i = 0; i < 10; ++i){
            int x = computer.random_coord(), y = computer.random_coord();
            assertEquals(0 <= x && x <= 2, true);
            assertEquals(0 <= y && y <= 2, true);
        }
    }
    @Test
    public void winsIsInitiallyZero(){
        Player human = new Player();
        assertEquals(human.getWins(), 0);
    }
}
