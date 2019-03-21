import java.util.*;
public class Player
{
    private List<Item> inventory;
    public Player()
    {
    }
    public boolean checkIfInventoryContains(String itemName)
    {
        for (Item i : inventory)
        {
            if (i.itemName == itemName)
            {
                return true;
            }
        }
        return false;
    }
}
