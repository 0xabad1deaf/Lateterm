package is.abadidea.tictactoe;

public class Grid {

    public int[][] matrix;

    public Grid(){
        matrix = new int[3][3];
    }

    public void set_x(int x, int y){
        matrix[x][y] = 1;
    }

    public void set_o(int x, int y){
        matrix[x][y] = 2;
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
               json += "\"box" + i + j + "\": " + matrix[i][j] + ", ";
           }
       }
       json += "]}";
       return json;
   }
}
