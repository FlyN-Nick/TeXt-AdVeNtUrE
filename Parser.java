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
        int i = 0;
        int test = 0;
        String[] commandtarget = new String[2];
        while (i != input.length())
        {
            char temp=input.charAt(i);
            if (temp == ' ')
            {
                commandtarget = input.split(" ");
                test = 1;
            }
        }
        if (test != 1)
        {
            throw new IllegalArgumentException("No target specified.");
        }
        String[] LegalCommands = {"Take", "Go", "Observe", "Equip"};
        //LegalCommands = {"Take", "Go", "Observe", "Equip"};
        if (Arrays.asList(LegalCommands).contains(commandtarget))
        {
            int meaningless = 0;
        }
        else 
        {
            throw new IllegalArgumentException("Not a legal command.");
        }
        return new Command(commandtarget[0], commandtarget[1]);
    }
    public void addUnlockedCommand(String commandName)
    {
        unlockedCommands.add(commandName);
        int x = 0;
    }
}
