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
                return response;
            }
        });

        get(new Route("/pve") {
            @Override
            public Object handle(Request request, Response response) {
                game = new Game(true);
                response.redirect("/game.html");
                return response;
            }
        });

        get(new Route("/pvp") {
            @Override
            public Object handle(Request request, Response response) {
                game = new Game(false);
                response.redirect("/game.html");
                return response;
            }
        });

        get(new Route("/handleClick") {
            @Override
            public Object handle(Request request, Response response) {
                boolean win = false; //game.playRound(Integer.parseInt(request.queryParams("x")), Integer.parseInt(request.queryParams("y")));
                //if(!win)
                    //return game.getState();
                return "{ \"win\": true }";
            }
        });

    }

}
