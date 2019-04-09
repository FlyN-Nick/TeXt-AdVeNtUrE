import java.util.*;
public class Room implements Commandable
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
    public boolean checkCommand()
    {
        return true;
    }
    public Result runCommand()
    {
        return new Result();
    }

}
