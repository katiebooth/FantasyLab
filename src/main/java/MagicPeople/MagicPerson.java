package MagicPeople;

public abstract class MagicPerson extends Player implements ICastSpell {
    Spell spell;
    Creature creature;


    public MagicPerson(String name, int gold, int health, Spell spell, Creature creature) {
        super(name, gold, health);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return spell;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }



}
