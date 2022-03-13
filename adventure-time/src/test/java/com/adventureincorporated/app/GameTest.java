package com.adventureincorporated.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.adventureincorporated.game.Game;
import com.adventureincorporated.game.Player;
import  com.adventureincorporated.location.*;

/**
 * Unit test for simple App.
 */
public class GameTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Player p = new Player();
        SafeHouse sh = new SafeHouse();
        Game game = new Game(p, sh);
        game.start();

        assertTrue(true);
    }
}
