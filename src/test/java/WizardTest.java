import MagicPeople.Creature;
import MagicPeople.Spell;
import MagicPeople.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setUp(){
        wizard = new Wizard("Sirius", Spell.FIENDFYRE, 0, 100, Creature.DRAGON);
    }

    @Test
    public void wizardCanCastSpell(){
        assertEquals("Wizard has cast fiendfyre. This sets fire to things", wizard.castSpell(Spell.FIENDFYRE));
    }


}
