package MagicPeople;

public abstract class MagicPerson extends Player implements ICastSpell {
    String name;
    Spell spell;
    int gold;
    int health;
    Creature creature;


    public MagicPerson(String name, Spell spell, int gold, int health, Creature creature) {
        super(name, gold, health);
        this.spell = spell;
        this.creature = creature;
    }

    public String getName() {
        return name;
    }

    public Spell getSpell() {
        return spell;
    }

    public int getGold() {
        return gold;
    }

    public int getHealth() {
        return health;
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
