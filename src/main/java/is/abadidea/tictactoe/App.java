package is.abadidea.tictactoe;

import static spark.Spark.*;
import spark.*;

public class App 
{
    public static void main( String[] args )
    {
        get(new Route("/") {
            @override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });
    }
}
