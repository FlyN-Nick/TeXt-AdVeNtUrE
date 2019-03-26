import java.util.*;
public class StringReverser
{
    public StringReverser()
    {
    }
    public String reverseString(String theString)
    {
        String newString = "";
        for (int i = theString.toCharArray().length - 1; i >= 0; i--)
        {
            newString = newString + theString.toCharArray()[i];
        }
        return newString;
    }
}
