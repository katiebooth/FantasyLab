import Healers.Cleric;
import Healers.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void setUp(){
        cleric = new Cleric("Madame Pomprey", HealingTool.HERBS);
    }

    @Test
    public void clericCanHeal(){
        assertEquals("Cleric has chosen herbs to heal", cleric.heal(HealingTool.HERBS));
    }
}

