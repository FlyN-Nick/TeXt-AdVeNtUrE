import java.util.*;
public interface Commandable
{
    boolean checkCommand();
    boolean checkTarget();
    public Result runCommand();
}
