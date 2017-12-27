package bowling;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BowlingTestCase {

	Bowling game, spareGame, strikeGame, perfectScoreGame;
	
	@Before
	public void setUp() throws Exception {
		game = new Bowling(new int[][]{{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}});
		spareGame = new Bowling(new int[][]{{5,5},{3,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}});
		strikeGame = new Bowling(new int[][]{{10,0},{5,4},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}});
		perfectScoreGame = new Bowling(new int[][]{{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0}});
	}
	
	@Test
	public void testScoreWithZeroOnBothRolls(){
		assertEquals(game.getScore(), 0);
	}
	
	@Test
	public void testFrameScoreWithASpare(){
		assertEquals(spareGame.getScore(), 16);
	}
	
	@Test
	public void testFrameScoreWithStrike() {
		assertEquals(strikeGame.getScore(), 28);
	}
	
	@Test
	public void testPerfectScore() {
		assertEquals(perfectScoreGame.getScore(), 300);
	}

}
