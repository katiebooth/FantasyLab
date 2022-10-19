package MagicPeople;

import Rooms.Enemy;

public class Wizard extends MagicPerson{

    public Wizard(String name, int gold, int health, Spell spell, Creature creature) {
        super(name, gold, health, spell, creature);
    }

    public void castSpell(Spell spell, Enemy enemy) {
        if(enemy.getHealth() > 0 )
        {System.out.println(this.getName() + " cast the "+ this.getSpell()+" spell!");
        enemy.takeDamage(spell.getPower());
        System.out.println("Enemy health after spell : " + enemy.getHealth());}
        else System.out.println("You have defeated "+ enemy.getName()+"!");
        }

    public void takeDamage(int damage){
        int damageToInflict;
        damageToInflict = Math.max(0, damage - getCreature().getProtectionPower());
        health -= damageToInflict;
        System.out.println("Player is protected by "+getCreature().getName()+" and their protection power of "
                +getCreature().getProtectionPower()+". Damage inflicted is only " + damageToInflict);
    }


}
