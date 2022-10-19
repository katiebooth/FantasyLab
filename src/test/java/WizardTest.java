import Healers.Cleric;
import Healers.HealingTool;
import MagicPeople.Creature;
import MagicPeople.Spell;
import MagicPeople.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Cleric cleric;

    @Before
    public void setUp(){
        wizard = new Wizard("Sirius", 0, 100, Spell.FIENDFYRE,Creature.DRAGON);
        cleric = new Cleric("Madame Pomprey", HealingTool.POTION);
    }

//    Testing a dummy spell function
//    @Test
//    public void wizardCanCastSpell(){
//        assertEquals("Wizard has cast fiendfyre. This sets fire to things", wizard.castSpell(Spell.FIENDFYRE));
//    }

    @Test
    public void wizardHasName(){
        assertEquals("Sirius", wizard.getName());
    }

    @Test
    public void wizardHasHealth(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canTakeDamage(){
        wizard.takeDamage(50);
        assertEquals(60, wizard.getHealth());
    }

    @Test
    public void canGetHealthBoost(){
        wizard.takeDamage(50);
        wizard.boostHealth(cleric);
        assertEquals(90, wizard.getHealth());
    }


}
