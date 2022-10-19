import Fighters.Fighter;
import Rooms.IPlayable;
import Rooms.Room;

public class Game {
    Room room;

    public Game(Room room, Fighter fighter) {
        this.room = room;
        this.fighter = fighter;
    }

    public Room getRoom() {
        return room;
    }

    public IPlayable getPlayer() {
        return fighter;
    }

    public String playGame(Room room, Fighter player){
        return "Game is in room " + room +" with "+ player.getName();
    }
}
