package is.abadidea.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void winsIsInitiallyZero(){
        Player human = new Player();
        assertEquals(human.getWins(), 0);
    }
}
