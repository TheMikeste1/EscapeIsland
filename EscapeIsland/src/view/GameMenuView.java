package view;

import control.MapControl;
import model.Player;
import java.util.Scanner;
import model.Map;
import escapeIsland.EscapeIsland;
import model.Location;

/**
 *
 * @author Austin
 */
public class GameMenuView extends View {

    public GameMenuView (EscapeIsland mainGame) {
        super(mainGame);
    }

    public boolean doAction(String[] inputs) {

//        Player player = EscapeIsland.getPlayer();
        Map map = mainGame.getCurrentGame().getMapControl().getMap();
//
        char c = inputs[0].trim().toUpperCase().charAt(0);
//
        switch (c) {
            case 'V':
                this.displayMap(map);
                break;
            case 'I':
                openInventory();
                break;
            case 'E':
                interactWithEnvironment();
                break;
            case 'M':
                moveToNewLocation();
                break;
            case 'R':
                riddleHints();
                break;
            case 'H':
                hints();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Option.");

        }

        return false;
    }

    public String[] getInputs() {
        {

            String[] inputs = new String[1];
            inputs[0] = getInput("***********************************************************"
                    + "\n***********************************************************"
                    + "\n*                                                         *"
                    //                    + "\n* W - Move North                                          *"
                    //                    + "\n* A - Move West                                           *"
                    //                    + "\n* S - Move South                                          *"
                    //                    + "\n* D - Move East                                           *"
                    + "\n* V - View Map                                            *"
                    + "\n* I - Inventory                                           *"
                    + "\n* E - Interact With Enviroment                            *"
                    + "\n* M - Move to new location                                *"
                    + "\n* R - Riddle Hints                                        *"
                    + "\n* H - Help                                                *"
                    + "\n* Q - Quit to Main Menu                                   *"
                    + "\n*                                                         *"
                    + "\n***********************************************************"
                    + "\n***********************************************************");

            return inputs;
        }
    }

//    private void moveNorth(Player player) {
//        int newPosition = player.getPositionY();
//        newPosition++;
//        player.setPositionY(newPosition);
//        System.out.println("Move North One Tile");
//
//    }
//
//    private void moveEast(Player player) {
//        int newPosition = player.getPositionX();
//        newPosition++;
//        player.setPositionX(newPosition);
//        System.out.println("Move East One Tile");
//
//    }
//
//    private void moveSouth(Player player) {
//        int newPosition = player.getPositionY();
//        newPosition--;
//        player.setPositionY(newPosition);
//        System.out.println("Move South One Tile");
//
//    }
//
//    private void moveWest(Player player) {
//        int newPosition = player.getPositionX();
//        newPosition--;
//        player.setPositionX(newPosition);
//        System.out.println("Move West One Tile");
//
//    }
//
    public void displayMap(Map map) {
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
                if (locations[0][0].isVisited()) {
                    System.out.print("| " + locations[0][0].getBackgroundType() + " ");
                } else {
                    System.out.print("| ?? ");
                }
            }
                System.out.println("|\n -------------------------------");

            }

        }
     

    public void viewMap(Map map) {
        MapView mapView = new MapView();
        mapView.display();
    }

    public void openInventory() {
        InventoryView openInventory = new InventoryView();
        openInventory.display();

    }

    private void interactWithEnvironment() {
        InteractWithEnviromentView interactWithEnvironment = new InteractWithEnviromentView(mainGame);
        interactWithEnvironment.display();

    }

    public void displayGameMenuView() {
        MainMenuView displayGameMenu = new MainMenuView(mainGame);
    }

    private void moveToNewLocation() {
        MapView mapView = new MapView();
        mapView.display();
    }

    private void hints() {
        System.out.println("\n***********************************************************"
                + "\n***********************************************************"
                + "\n*                                                         *"
                + "\n*                        Hints                            *"
                + "\n* The Tool Kit can be used in many areas.                 *"
                + "\n* Sometimes to go forward you must go backwards.          *"
                + "\n* Losing Fights? Try exploring the map.                   *"
                + "\n*                                                         *"
                + "\n***********************************************************"
                + "\n***********************************************************");
        return;
    }

    private void riddleHints() {
        // display a list of all the riddles, and the answers.
        mainGame.getCurrentGame().getGameControl().riddleArrayList();
    }

}
