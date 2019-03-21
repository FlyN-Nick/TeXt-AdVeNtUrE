import java.util.*;
public class Parser
{
    static public ArrayList<String> allPossibleCommands = new ArrayList<String>();
    static public ArrayList<String> unlockedCommands = new ArrayList<String>();
    public Parser()
    {
        if (allPossibleCommands == null)
        { // make the commands
            //allPossibleCommands.add("");
        }
    }
    public Command parseInput(String input)
    {
        return new Command("hi", "hi");
    }
    public void addUnlockedCommand(String commandName)
    {
        unlockedCommands.add(commandName);
    }
}
