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

    @Test
    public void set_xMethodSetsX(){
        Grid grid = new Grid();
        grid.set_x(1,1);
        assertEquals(grid.matrix[1][1], 1);
        assertEquals(grid.matrix[1][2], 0);
    }
    @Test
    public void set_yMethodSetsY(){
        Grid grid = new Grid();
        grid.set_o(1,1);
        assertEquals(grid.matrix[1][1], 2);
        assertEquals(grid.matrix[1][2], 0);
    }

    @Test
    public void getAtMethod(){
        Grid grid = new Grid();
        grid.set_x(1,1);
        assertEquals(grid.getAt(1,1), 1);
    }

    @Test
    public void clearGridMethod(){
        Grid grid = new Grid();
        grid.set_x(1,1);
        grid.set_o(0,0);
        grid.clearGrid();
        assertEquals(grid.getAt(1,1), 0);
        assertEquals(grid.getAt(0,0), 0);
    }
    @Test
    public void toJsonReturnsValidJson(){
        Grid grid = new Grid();
        grid.set_x(1,1);
        grid.set_o(0,0);
        String json = grid.toJson();
        String compare = "{ \"box00\": 2, \"box01\": 0, \"box02\": 0, \"box10\": 0, \"box11\": 1, \"box12\": 0, \"box20\": 0, \"box21\": 0, \"box22\": 0, }";
        assertEquals(compare.equals(json), true);
    }
}

