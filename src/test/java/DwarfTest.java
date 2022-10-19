import Fighters.Dwarf;
import Fighters.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void setUp(){
        dwarf = new Dwarf("Gimley", Weapon.AXE, 0, 100, 10);
    }

    @Test
    public void dwarfCanFight(){
        assertEquals("Dwarf is fighting with axe", dwarf.fight(Weapon.AXE));
    }
}
