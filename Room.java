import java.util.*;
public class Room implements Commandable
{
    public Room()
    {
    }
    public boolean checkCommand()
    {
        return true;
    }
    public Result runCommand()
    {
        return new Result("hi");
    }
}
