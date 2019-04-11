import java.util.*;
public class Command
{
    static public List<String> possibleTargets;
    String target;
    String action;
    boolean functional;
    public Command(String actionName, String targetName)
    {
        target = targetName;
        action = actionName;
    }
    public void addTarget(String possibleTargetName)
    {
        if (!possibleTargets.contains(possibleTargetName))
        {
            possibleTargets.add(possibleTargetName);
            functional = true;
        }
    }
    //public Result runCommand(String hi){
        
       //return hi;
    //}
}
