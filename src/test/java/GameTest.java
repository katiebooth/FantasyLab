import Healers.Cleric;
import Healers.HealingTool;
import MagicPeople.Creature;
import MagicPeople.Player;
import MagicPeople.Spell;
import MagicPeople.Wizard;
import Rooms.Enemy;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;
    Room room;
    Cleric cleric;

    @Before
    public void setUp(){
        cleric = new Cleric("Madame Pomprey", HealingTool.POTION);
        player = new Player("Bellatrix", 0, 100);
        room = new Room ("Room of requirement", 50, Enemy.ORC, cleric);
        game = new Game(room, player);
    }

    @Test
    public void canPlayGame(){
        assertEquals("Game is in room Room of requirement with Bellatrix", game.playGame(room, player));
    }

}
