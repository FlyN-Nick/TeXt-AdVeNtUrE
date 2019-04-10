import java.util.*;
public class Player
{
    private List<Item> inventory;
    public Player()
    {
    }
    public boolean checkIfInventoryContains(String itemName)
    {
        boolean returnval = false;
        for (Item i : inventory)
        {
            if (i.itemName == itemName)
            {
                returnval = true;
            }
            else {
                returnval = false;
            }
        }
        return returnval;
    }
}
