package is.abadidea.tictactoe;

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
                return "{\"message\": \"Hello World\"}";
            }
        });

    }

}
