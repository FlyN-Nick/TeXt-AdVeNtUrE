
/**
 * Write a description of interface Commandable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Commandable
{
    boolean checkCommand();
    boolean checkTarget(); 
    public Result runCommand();
}
