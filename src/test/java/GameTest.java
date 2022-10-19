import Fighters.Weapon;
import Healers.Cleric;
import Healers.HealingTool;
import MagicPeople.Player;
import Rooms.Enemy;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

//public class GameTest {
//
//    Game game;
//    Player player;
//    Room room;
//    Cleric cleric;
//    Enemy enemy;

//    @Before
//    public void setUp(){
//        cleric = new Cleric("Madame Pomprey", HealingTool.POTION);
//        enemy = new Enemy("Orc", Weapon.MACE, 50);
//        player = new Player("Bellatrix", 0, 100);
//        room = new Room ("Room of requirement", 50, enemy, cleric);
//        game = new Game(room, player);
//    }
//
//    @Test
//    public void canPlayGame(){
//        assertEquals("Game is in room Room of requirement with Bellatrix", game.playGame(room, player));
//    }
//
//}
