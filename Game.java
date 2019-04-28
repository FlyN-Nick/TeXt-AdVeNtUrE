public class Game
{
    private Map map;
    private Player player;
    public Parser parser;
    private Game rsRiseUp;
    public Commandable tester;
    public Main main;
    public Map startGamersWhoAreRisingUp(){
           //this is a test to see if the class is functional and the map object
           return map;
    }
    public void startGame(){

        int i=0;
        while (i>-1){
            String[] outputs= main.getInput();
            //System.out.println(main.getInput());
            Command command = parser.parseInput(outputs[0], outputs[1]);
        }
    }
}