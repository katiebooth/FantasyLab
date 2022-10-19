package Rooms;

import Fighters.Weapon;
import Healers.Cleric;
import MagicPeople.Wizard;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {

    private String name;
    private int availableGold;
    private Enemy enemy;
    Cleric cleric;

    public Room(String name, int availableGold, Enemy enemy, Cleric cleric) {
        this.name = name;
        this.availableGold = availableGold;
        this.enemy = enemy;
        this.cleric = cleric;
//        this.players = new HashMap<String, IPlayable>();
    }

    public String getName() {
        return name;
    }

    public int getAvailableGold() {
        return availableGold;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Cleric getCleric(){return cleric;}

//    public HashMap getPlayers(){return players;}
//
//    public void addPlayer(String name, IPlayable player){
//        players.put(name, player);
//    }
//
//    public IPlayable getSelectedPlayer() {
//        return this.players.get(this.selectedPlayerName);
//    }
//
//    public void setSelectedPlayer(String name){
//        this.selectedPlayerName = name;
//    }
//
////    public void playRoom(Wizard wizard){
////        wizard.castSpell(Spell spell, Enemy enemy);
////    }

    public void attack(Wizard wizard, Weapon weapon){
        System.out.println(this.getEnemy().getName()+" retaliates with " + weapon.getName()+" with power "+weapon.getPower());
        wizard.takeDamage(weapon.getPower());
    }

}
