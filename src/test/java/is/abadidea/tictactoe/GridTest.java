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
    public void set_oMethodSetsY(){
        Grid grid = new Grid();
        grid.set_o(1,1);
        assertEquals(grid.matrix[1][1], 2);
        assertEquals(grid.matrix[1][2], 0);
    }

    @Test
    public void setMethodsDontOverride(){
        Grid grid = new Grid();
        grid.set_o(1,1);
        grid.set_x(1,1);
        assertEquals(grid.getAt(1,1),2);
        grid.set_x(0,0);
        grid.set_o(0,0);
        assertEquals(grid.getAt(0,0),1);
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
        String compare = "{ \"matrix\": [2,0,0,0,1,0,0,0,0,0]}";
        assertEquals(compare.equals(json), true);
    }
}

