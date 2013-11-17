package is.abadidea.tictactoe;

public class Grid {

    public int[][] matrix;

    public Grid(){
        matrix = new int[3][3];
    }

    public void set_x(int x, int y){
        matrix[x][y] = 1;
    }

    public void set_y(int x, int y){
        matrix[x][y] = 2;
    }
    public int getAt(int x, int y){
        return matrix[x][y];
    }
}
