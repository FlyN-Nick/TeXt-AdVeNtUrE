import java.util.*;
public abstract class Room implements Commandable
{
    private int xLocation;
    private int yLocation;

    public Room(int xLocation, int yLocation)
    {

    }
    public int getXLocation() {
        return xLocation;
    }
    public int getYLocation() {
        return yLocation;
    }
    public enum Items {
        
    }
    public Item placeItem(String[] itemlist) {
        
        return new Item("Sword");
    }
    public String[] randomExits(){
        String[] exits = {"north", "west", "south"};
        return exits;
    }
    public boolean checkCommand()
    {
        return true;
    }
    public Result runCommand()
    {
        return new Result();
    }

}
