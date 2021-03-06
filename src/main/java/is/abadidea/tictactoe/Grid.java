package is.abadidea.tictactoe;

public class Grid {

    public int[][] matrix;

    public Grid(){
        matrix = new int[3][3];
    }

    public boolean set_x(int x, int y){
        if(matrix[x][y] == 0){
            matrix[x][y] = 1;
            return true;
        }
        return false;
    }

    public boolean set_o(int x, int y){
        if(matrix[x][y] == 0){
            matrix[x][y] = 2;
            return true;
        }
        return false;

    }
    public int getAt(int x, int y){
        return matrix[x][y];
    }
    public void clearGrid(){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = 0;
            }
        }
   }
   public String toJson(){
       String json = "{ \"matrix\": [";
       for(int i = 0; i <= 2 ;++i){
           for(int j = 0; j <= 2; ++j){
               json += matrix[i][j] + ",";
           }
       }
       json += "0]}";
       return json;
   }
}
