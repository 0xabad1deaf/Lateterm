package is.abadidea.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GridTest {

    @Test
    public void constructorReturns2Darray(){
        Grid grid = new Grid();
        assertEquals(grid.matrix.length, 3);
        assertEquals(grid.matrix[0].length, 3);
        assertEquals(grid.matrix[1].length, 3);
        assertEquals(grid.matrix[2].length, 3);
    }

}

