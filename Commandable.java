import java.util.*;
public interface Commandable extends CommandTestable
{
    boolean checkCommand();
    public Result runCommand();
}
