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
        //function not done yet
        return true;
    }
    boolean checkCommand(String command)
    {
        boolean returnval = false;
        if (acceptableCommands.contains(command))
        {
            returnval = true;
        }
        return returnval;
    }
    public Result runCommand(String command)
    {
        return new Result();//commandsToResult.get(command) <- that code not working so i changed it to result
    }
}
