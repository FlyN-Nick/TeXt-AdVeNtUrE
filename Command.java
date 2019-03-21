import java.util.*;
public class Command
{
    static public List<String> possibleTargets;
    String target;
    String action;
    public Command(String targetName, String actionName)
    {
        target = targetName;
        action = actionName;
    }
    public void addTarget(String possibleTargetName)
    {
        if (!possibleTargets.contains(possibleTargetName))
        {
            possibleTargets.add(possibleTargetName);
        }
    }
    
}
