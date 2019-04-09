import java.util.*;
public class Item
{
    public String itemName;
    List<String> acceptableCommands;
    HashMap<String, String> commandsToResult = new HashMap<String, String>();
    public Item(String itemName)
    {
        this.itemName = itemName;
    }
    boolean checkAvailability(){
        return true;
    }
    boolean checkCommand(String command)
    {
        if (acceptableCommands.contains(command))
        {
            return true;
        }
        return false;
    }
    public Result runCommand(String command)
    {
        return new Result();//commandsToResult.get(command)
    }
}
