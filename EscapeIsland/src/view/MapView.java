package view;

import model.Map;
import escapeIsland.EscapeIsland;
import model.Player;
import java.util.Scanner;

/**
 *
 * @author Austin
 */
import model.Location;
public class MapView extends View {

    public MapView() {
    }

    public boolean doAction(String[] inputs) {

        Scanner sc = new Scanner(System.in);
        Player player = EscapeIsland.getCurrentPlayer();
        Map map = EscapeIsland.getCurrentGame().getMap();

        
        while (true) {

            displayMap(map);
            String mapInput;
            mapInput = sc.next();
            char c = mapInput.trim().toUpperCase().charAt(0);

            switch (c) {
                case 'W':
                    System.out.println("moveNorth");
                    moveNorth(player, map);
                    break;
                case 'A':
                    System.out.println("moveWest");
                    moveWest(player, map);
                    break;
                case 'S':
                    System.out.println("moveSouth");
                    moveSouth(player, map);
                    break;
                case 'D':
                    System.out.println("moveEast");
                    moveEast(player, map);
                    break;
                case 'E':
                    exploreScene();
                    break;
                case 'Q':
                    return true;
                default:
                    System.out.println("Invalid Option.");

            }
        }

    }

        public void displayMap(Map map) {
            System.out.println(EscapeIsland.getCurrentPlayer().getActor().getActorcoordinates().x);
            System.out.println(EscapeIsland.getCurrentPlayer().getActor().getActorcoordinates().y);
        Location[][] locations = map.getLocations();
        
        System.out.println("*** displayMap called ***");

        map.getLocations();

        System.out.println("     Mysterious Island");

        System.out.print(" ");
        for (int i = 0; i < map.getColumnSize(); i++) {
            System.out.print((i + 1) + "    ");
        }

        System.out.println("\n -------------------------------");

        for (int i = 0; i < map.getRowSize(); i++) {
            System.out.print(i + 1);

            for (int j = 0; j < map.getColumnSize(); j++) {
                if (locations[i][j].isVisited()) {
                    
                    if (i == EscapeIsland.getCurrentPlayer().getActor().getActorcoordinates().x 
                            && j == EscapeIsland.getCurrentPlayer().getActor().getActorcoordinates().y){
                        System.out.print("H");
                    }
                    else {
                        System.out.print("| " + locations[0][0].getBackgroundType() + " ");
                    }
                } else {
                    System.out.print("| ?? ");
                }
            }
                System.out.println("|\n -------------------------------");

            }

        }
    
    public String[] getInputs() {
        {

            String[] inputs = new String[1];
            inputs[0] = getInput("***********************************************************"
                    + "\n***********************************************************"
                    + "\n*                                                         *"
                    + "\n* W - Move North                                          *"
                    + "\n* A - Move West                                           *"
                    + "\n* S - Move South                                          *"
                    + "\n* D - Move East                                           *"
                    + "\n* E - Explore Scene                                       *"
                    + "\n* Q - Quit to Main Menu                                   *"
                    + "\n*                                                         *"
                    + "\n***********************************************************"
                    + "\n***********************************************************");

            return inputs;
        }
    }

    private void moveNorth(Player player, Map map) {
        
        int newPosition = player.getActor().getActorcoordinates().y;
        newPosition--;
        player.getActor().getActorcoordinates().y = newPosition;
        System.out.println("Move North One Tile");
        map.getLocations()[player.getActor().getActorcoordinates().x][player.getActor().getActorcoordinates().y].setVisited(true);
    }

    private void moveEast(Player player, Map map) {
        int newPosition = player.getActor().getActorcoordinates().x;
        newPosition++;
        player.getActor().getActorcoordinates().x = newPosition;
        System.out.println("Move East One Tile");
        map.getLocations()[player.getActor().getActorcoordinates().x][player.getActor().getActorcoordinates().y].setVisited(true);

    }

    private void moveSouth(Player player, Map map) {
        int newPosition = player.getActor().getActorcoordinates().y;
        newPosition++;
        player.getActor().getActorcoordinates().y = newPosition;
        System.out.println("Move South One Tile");
        map.getLocations()[player.getActor().getActorcoordinates().x][player.getActor().getActorcoordinates().y].setVisited(true);

    }

    private void moveWest(Player player, Map map) {
        int newPosition = player.getActor().getActorcoordinates().x;
        newPosition--;
        player.getActor().getActorcoordinates().x = newPosition;
        System.out.println("Move West One Tile");
        map.getLocations()[player.getActor().getActorcoordinates().x][player.getActor().getActorcoordinates().y].setVisited(true);

    }

    private void exploreScene() {
        InteractWithEnviromentView interactWithEnvironment = new InteractWithEnviromentView();
        interactWithEnvironment.display();
    }

    public void openMap(Map map, Player player) {

        for (int mapZ = 0; mapZ < map.getRowSize(); mapZ++) {
            for (int mapX = 0; mapX < map.getColumnSize(); mapX++) {
                if(map.getLocations()[mapZ][mapX].getColumn() == player.getActor().getActorcoordinates().getX() &&
                        map.getLocations()[mapZ][mapX].getRow() == player.getActor().getActorcoordinates().getY()) {
                    map.getLocations()[mapZ][mapX].setVisited(true);
                }
            }
        }
        
        for (int mapR = 0; mapR < map.getRowSize(); mapR++) {
            for (int mapC = 0; mapC < map.getColumnSize(); mapC++) {
                if (player.getActor().getActorcoordinates().x == mapR && player.getActor().getActorcoordinates().y == mapC) {
                    System.out.print("H");
                    
                }
                System.out.print(map.physicalMapView[mapR][mapC]);
            }
            System.out.print("\n");
        }
    }

}

// display the heros current location on the map
// allow the hero to move
// update the map based on that
// display scene based on map tile
// call interactWithEnvironment

