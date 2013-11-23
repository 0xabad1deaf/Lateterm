package is.abadidea.tictactoe;

import java.lang.Integer;
import static spark.Spark.*;
import spark.*;

public class App 
{
    private static Game game;

    public static void main( String[] args )
    {
        staticFileLocation("/public");

        // Set port for heroku
        setPort(Integer.valueOf(System.getenv("PORT")));

        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                response.redirect("/index.html");
                return "Top O' the mornin' to ye, guv'nor!";
            }
        });

        get(new Route("/initialize") {
            @Override
            public Object handle(Request request, Response response) {
                boolean gameType = Boolean.parseBoolean(request.queryParams("gametype"));
                game = new Game(gameType);
                return "hihi";
            }
        });

        get(new Route("/replay") {
            @Override
            public Object handle(Request request, Response response) {
                if(game != null){
                    game.grid.clearGrid();
                    game.winner = 0;
                    game.full = false;
                }
                System.out.println(game.getState());
                return game.getState();
            }
        });

        get(new Route("/handleClick") {
            @Override
            public Object handle(Request request, Response response) {
                boolean win = false;
                int x = Integer.parseInt(request.queryParams("x"));
                int y = Integer.parseInt(request.queryParams("y"));
                System.out.println("winner?" + x + y);
                if(game == null){
                    System.out.println("ohoh");
                }
                game.playRound(x,y);
                System.out.println("bla");
                System.out.println(game.getState());
                return game.getState();
            }
        });

    }

}
