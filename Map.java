import java.util.*;
public class Map {
    private List<Room> rooms;
    private Room currentRoom;
    private HashMap<Integer, Integer> locationViaX = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> locationViaY = new HashMap<Integer, Integer>();    
    
    //locationViaX.put(xLocation, yLocation);
    //locationViaY.put(yLocation, xLocation);
    public String currentRoomCoordinates()
    { 
        return "X: "+ currentRoom.getXLocation() +" Y: "+currentRoom.getYLocation();
    }
    
    public Room moveToRoom( Room nextRoom ) {
        return null;//ROOMCOORDINATES();
    }
        public boolean checkLocation(int theX, int theY)
    {
        if (locationViaX.containsKey(theX) && locationViaY.containsKey(theY))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
