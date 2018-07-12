package view;

import control.MapControl;
import model.Map;
import escapeIsland.EscapeIsland;
import exceptions.MapControlException;
import model.Player;
import java.util.Scanner;
import model.Actor;

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
                case 'V':
                    viewMap(map);
                    break;
                case 'E':
                    exploreScene();
                    break;
                case 'Q':
                    return true;
                default:
                    System.out.println("Invalid Option.");

            }
            map.getLocations()[player.getActor().getActorcoordinates().x]
                   [player.getActor().getActorcoordinates().y].setVisited(true);
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

        System.out.println("\n ----------------------------");

        for (int i = 0; i < map.getRowSize(); i++) {
            System.out.print(i + 1);

            for (int j = 0; j < map.getColumnSize(); j++) {
                if (locations[i][j].isVisited()) {
                    
                    if (i == EscapeIsland.getCurrentPlayer().getActor().getActorcoordinates().x 
                            && j == EscapeIsland.getCurrentPlayer().getActor().getActorcoordinates().y){
                        System.out.print("| H ");
                    }
                    else {
                        System.out.print("| " + locations[i][j].getBackgroundType().getPrintValue() + " ");
                    }
                } else {
                    System.out.print("| ? ");
                }
            }
                System.out.println("|\n ----------------------------");

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
                    + "\n* V - View Map                                            *"
                    + "\n* E - Explore Scene                                       *"
                    + "\n* Q - Quit to Main Menu                                   *"
                    + "\n*                                                         *"
                    + "\n***********************************************************"
                    + "\n***********************************************************");

            return inputs;
        }
    }

    private void moveNorth(Player player, Map map) {
        Actor hero = player.getActor();
        int newRow = hero.getActorcoordinates().x-1;
        int newColumn = hero.getActorcoordinates().y;

        try {
            MapControl.moveActor(hero, newRow, newColumn);
        } catch (MapControlException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void moveEast(Player player, Map map) {
        Actor hero = player.getActor();
        int newRow = hero.getActorcoordinates().x;
        int newColumn = hero.getActorcoordinates().y+1;
        try {
            MapControl.moveActor(hero, newRow, newColumn);
        } catch (MapControlException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void moveSouth(Player player, Map map) {
        Actor hero = player.getActor();
        int newRow = hero.getActorcoordinates().x+1;
        int newColumn = hero.getActorcoordinates().y;
        try {
            MapControl.moveActor(hero, newRow, newColumn);
        } catch (MapControlException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void moveWest(Player player, Map map) {
         Actor hero = player.getActor();
        int newRow = hero.getActorcoordinates().x;
        int newColumn = hero.getActorcoordinates().y-1;
        try {
            MapControl.moveActor(hero, newRow, newColumn);
        } catch (MapControlException ex) {
            System.out.println(ex.getMessage());
        
        }
    }
    public void viewMap(Map map) {
        MapView mapView = new MapView();
        mapView.display();
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