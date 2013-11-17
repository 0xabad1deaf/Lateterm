package is.abadidea.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

	// @Test
	// public void newGameMethod(){
	// 	Game game = new Game();
	// }

	@Test
	public void GameConstructor(){
		Game game = new Game(true);
		assertEquals(game.gameType, true);
		assertEquals(game.player1.wins, 0);
		assertEquals(game.player2.wins, 0);
	}

	@Test
	public void gotWinnerMethod(){
		Game game = new Game(true);

<<<<<<< HEAD
=======

>>>>>>> c7a3be443932965cb77910920cf0213f8f7a9178
		//Testing every possible row that resaults in a win
		game.grid.set_x(0,0);
		game.grid.set_x(0,1);
		game.grid.set_x(0,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_y(0,0);
		game.grid.set_y(1,1);
		game.grid.set_y(2,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_x(0,0);
		game.grid.set_x(1,0);
		game.grid.set_x(2,0);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_y(0,1);
		game.grid.set_y(1,1);
		game.grid.set_y(0,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_x(0,2);
		game.grid.set_x(1,2);
		game.grid.set_x(2,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_y(1,0);
		game.grid.set_y(1,1);
		game.grid.set_y(1,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_x(2,0);
		game.grid.set_x(2,1);
		game.grid.set_x(2,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_y(0,2);
		game.grid.set_y(1,1);
		game.grid.set_y(2,0);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		//Some combinations that sould not resault in a win
		game.grid.set_y(0,2);
		game.grid.set_x(1,1);
		game.grid.set_y(2,0);
		assertEquals(game.gotWinner(), false);
		game.grid.clearGrid();
		game.grid.set_y(0,2);
		game.grid.set_y(1,1);
		game.grid.set_y(2,2);
		assertEquals(game.gotWinner(), false);
		game.grid.clearGrid();
		game.grid.set_y(2,1);
		game.grid.set_y(1,2);
		game.grid.set_y(2,2);
		assertEquals(game.gotWinner(), false);
		game.grid.clearGrid();
<<<<<<< HEAD
=======



>>>>>>> c7a3be443932965cb77910920cf0213f8f7a9178
	}
}
