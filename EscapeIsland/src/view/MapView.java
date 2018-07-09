package view;

import model.Map;
import escapeIsland.EscapeIsland;
import model.Player;
import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class MapView extends View {

    public MapView() {
    }

    public boolean doAction(String[] inputs) {

        Scanner sc = new Scanner(System.in);
        Player player = EscapeIsland.getCurrentPlayer();
        Map map = EscapeIsland.getCurrentGame().getMapControl().getMap();

        while (true) {

            String mapInput;
            mapInput = sc.next();
            char c = inputs[0].trim().toUpperCase().charAt(0);

            switch (c) {
                case 'W':
                    moveNorth(player, map);
                    openMap(map, player);
                    break;
                case 'A':
                    moveWest(player, map);
                    openMap(map, player);
                    break;
                case 'S':
                    moveSouth(player, map);
                    openMap(map, player);
                    break;
                case 'D':
                    moveEast(player, map);
                    openMap(map, player);
                    break;
                case 'M':
                    openMap(map, player);
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
                    + "\n* M - Open Map                                            *"
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

    }

    private void moveEast(Player player, Map map) {
        int newPosition = player.getActor().getActorcoordinates().x;
        newPosition++;
        player.getActor().getActorcoordinates().x = newPosition;
        System.out.println("Move East One Tile");

    }

    private void moveSouth(Player player, Map map) {
        int newPosition = player.getActor().getActorcoordinates().y;
        newPosition++;
        player.getActor().getActorcoordinates().y = newPosition;

        System.out.println("Move South One Tile");

    }

    private void moveWest(Player player, Map map) {
        int newPosition = player.getActor().getActorcoordinates().x;
        newPosition--;
        player.getActor().getActorcoordinates().x = newPosition;
        System.out.println("Move West One Tile");

    }

    private void exploreScene() {
        InteractWithEnviromentView interactWithEnvironment = new InteractWithEnviromentView(mainGame);
        interactWithEnvironment.display();
    }

    public void openMap(Map map, Player player) {

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

