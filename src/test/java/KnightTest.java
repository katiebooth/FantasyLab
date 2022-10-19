import Fighters.Dwarf;
import Fighters.Knight;
import Fighters.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void setUp(){
        knight = new Knight("Arthur", Weapon.SWORD, 0, 100, 20);
    }

    @Test
    public void knightCanFight(){
        assertEquals("Knight is fighting with sword", knight.fight(Weapon.SWORD));
    }
}
