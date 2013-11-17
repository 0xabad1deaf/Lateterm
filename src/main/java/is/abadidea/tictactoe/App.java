package is.abadidea.tictactoe;

import static spark.Spark.*;
import spark.*;

public class App 
{
    private static char[] matrix;

    public static void main( String[] args )
    {
        staticFileLocation("/public");

        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                response.redirect("/index.html");
                return "hello";
            }
        });
    }
}
