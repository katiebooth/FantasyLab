import Fighters.Barbarian;
import Fighters.Knight;
import Fighters.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;

    @Before
    public void setUp(){
        barbarian = new Barbarian("John", Weapon.CLUB, 0, 100);
    }

    @Test
    public void BarbarianCanFight(){
        assertEquals("Barbarian is fighting with club", barbarian.fight(Weapon.CLUB));
    }
}
