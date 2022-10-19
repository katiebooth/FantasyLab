import Fighters.Weapon;
import Healers.Cleric;
import Healers.HealingTool;
import MagicPeople.Creature;
import MagicPeople.Player;
import MagicPeople.Spell;
import MagicPeople.Wizard;
import Rooms.Enemy;
import Rooms.Room;

public class Runner {

    public static void main(String[] args) {
            Game game;
            Wizard wizard;
            Room room;
            Cleric cleric;
            Enemy enemy;

            cleric = new Cleric("Madame Pomprey", HealingTool.POTION);
            enemy = new Enemy("Orc", Weapon.CLUB, 80);
            wizard = new Wizard("Bellatrix", 100, 100, Spell.FLIPENDO, Creature.HIPPOGRIFF);
            room = new Room ("Room of requirement", 50, enemy, cleric);
            game = new Game(room, wizard);

            game.playGame();

    }
}
