package MagicPeople;

public class Wizard extends MagicPerson{

    public Wizard(String name, Spell spell, int gold, int health, Creature creature) {
        super(name, spell, gold, health, creature);
    }

    @Override
    public String castSpell(Spell spell) {
        return "Wizard has cast "+ spell.getName()+". " + spell.getDesc();
    }
}
