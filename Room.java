import java.util.*;
public class Room implements Commandable
{
    private HashMap<Integer, Integer> locationViaX = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> locationViaY = new HashMap<Integer, Integer>();
    public Room(int xLocation, int yLocation)
    {
        locationViaX.put(xLocation, yLocation);
        locationViaY.put(yLocation, xLocation);
    }
    public boolean checkCommand()
    {
        return true;
    }
    public Result runCommand()
    {
        return new Result("hi");
    }
    public boolean checkLocation(int theX, int theY)
    {
        if (locationViaX.containsKey(theX) && locationViaY.containsKey(theY))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
