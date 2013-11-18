package is.abadidea.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

    @Test
	public void GameConstructor(){
		Game game = new Game(true);
		assertEquals(game.gameType, true);
		assertEquals(game.player1.wins, 0);
		assertEquals(game.player2.wins, 0);
	}

    @Test
	public void switchPlayerResultsInNewCurrentPlayer(){
		Game game = new Game(false);
		assertEquals(game.player2 == game.currentPlayer, false);
        game.switchPlayer();
		assertEquals(game.player2 == game.currentPlayer, true);
        game.switchPlayer();
		assertEquals(game.player2 == game.currentPlayer, false);
	}

    @Test
	public void playRoundChangesGridAccordingly(){
		Game game = new Game(true);
		Grid compare = new Grid();
        game.playRound(1,1);
        compare.set_x(1,1);
        assertEquals(compare.getAt(1,1), game.grid.getAt(1,1));
        game = new Game(false);
        compare.clearGrid();
        compare.set_x(1,1);
        game.playRound(1,1);
        game.playRound(1,1);
        assertEquals(compare.getAt(1,1), game.grid.getAt(1,1));
        compare.set_o(2,0);
        game.playRound(0,0);
        game.playRound(2,0);
        assertEquals(compare.getAt(1,1), game.grid.getAt(1,1));
        assertEquals(compare.getAt(2,0), game.grid.getAt(2,0));
	}

	@Test
	public void playRoundWinsGame(){
		Game game = new Game(false);
		//test sould resault in a win
        game.playRound(0,0);
        game.playRound(2,0);
        game.playRound(1,1);
        game.playRound(2,1);
        assertEquals(game.playRound(2,2), true);
        game.grid.clearGrid();
        //test sould not resault in a win
        game.playRound(1,1);
        game.playRound(0,0);
        assertEquals(game.playRound(2,2), false);
        game.grid.clearGrid();
	}

	@Test
	public void gotWinnerMethod(){
		Game game = new Game(true);

		//Testing every possible row that resaults in a win
		game.grid.set_x(0,0);
		game.grid.set_x(0,1);
		game.grid.set_x(0,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_o(0,0);
		game.grid.set_o(1,1);
		game.grid.set_o(2,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_x(0,0);
		game.grid.set_x(1,0);
		game.grid.set_x(2,0);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_o(0,1);
		game.grid.set_o(1,1);
		game.grid.set_o(0,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_x(0,2);
		game.grid.set_x(1,2);
		game.grid.set_x(2,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_o(1,0);
		game.grid.set_o(1,1);
		game.grid.set_o(1,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_x(2,0);
		game.grid.set_x(2,1);
		game.grid.set_x(2,2);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		game.grid.set_o(0,2);
		game.grid.set_o(1,1);
		game.grid.set_o(2,0);
		assertEquals(game.gotWinner(), true);
		game.grid.clearGrid();
		//Some combinations that sould not resault in a win
		game.grid.set_o(0,2);
		game.grid.set_x(1,1);
		game.grid.set_o(2,0);
		assertEquals(game.gotWinner(), false);
		game.grid.clearGrid();
		game.grid.set_o(0,2);
		game.grid.set_o(1,1);
		game.grid.set_o(2,2);
		assertEquals(game.gotWinner(), false);
		game.grid.clearGrid();
		game.grid.set_o(2,1);
		game.grid.set_o(1,2);
		game.grid.set_o(2,2);
		assertEquals(game.gotWinner(), false);
		game.grid.clearGrid();
	}
}
