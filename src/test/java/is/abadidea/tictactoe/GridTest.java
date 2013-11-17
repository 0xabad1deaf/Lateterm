package is.abadidea.tictactoe;

import static org.junit.AssertEquals;
import org.junit.Test;

public class GridTest {

    private Grid grid;

    @Test
    public void constructorReturns2Darray(){
        grid = new Grid();
        assertEquals(grid.matrix.length, 3);
        assertEquals(grid.matrix[1].length, 3);
        assertEquals(grid.matrix[2].length, 3);
        assertEquals(grid.matrix[3].length, 3);
    }

}

