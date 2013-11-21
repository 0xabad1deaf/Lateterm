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

        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                response.redirect("/index.html");
                return null;
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
