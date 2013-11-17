package is.abadidea.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

	// @Test
	// public void newGameMethod(){
	// 	Game game = new Game();
	// }

	@Test
	public void typeOfGameMethod(){
		Game game = new Game(true);
		assertEquals(game.gameType, true);
	}

	@Test
	public void gotWinnerMethod(){
		Game game = new Game(true);

		game.grid.set_x(0,0);
		game.grid.set_x(0,1);
		game.grid.set_x(0,2);
		assertEquals(game.gotWinner(), true);
		game.grid.set_x(0,0);
		game.grid.set_x(1,1);
		game.grid.set_x(2,2);
		assertEquals(game.gotWinner(), false);
		game.grid.set_x(0,0);
		game.grid.set_x(1,0);
		game.grid.set_x(2,0);
		assertEquals(game.gotWinner(), true);
		game.grid.set_x(0,1);
		game.grid.set_x(1,1);
		game.grid.set_x(0,2);
		assertEquals(game.gotWinner(), true);
		game.grid.set_x(0,2);
		game.grid.set_x(1,2);
		game.grid.set_x(2,2);
		assertEquals(game.gotWinner(), true);
		game.grid.set_x(1,0);
		game.grid.set_x(1,1);
		game.grid.set_x(1,2);
		assertEquals(game.gotWinner(), true);
		game.grid.set_x(2,0);
		game.grid.set_x(2,1);
		game.grid.set_x(2,2);
		assertEquals(game.gotWinner(), true);
		game.grid.set_x(0,2);
		game.grid.set_x(1,1);
		game.grid.set_x(2,0);
		assertEquals(game.gotWinner(), true);

	}
}
