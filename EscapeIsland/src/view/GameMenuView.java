package view;

import model.Player;
import java.util.Scanner;
import model.Map;
import escapeIsland.EscapeIsland;

/**
 *
 * @author Austin
 */
public class GameMenuView extends View {

    public GameMenuView() {
    }

    public boolean doAction(String[] inputs) {

//        Player player = EscapeIsland.getPlayer();
        Map map = EscapeIsland.getCurGame().getMap();
//
        char c = inputs[0].trim().toUpperCase().charAt(0);
//
        switch (c) {
//            case 'W':
//                moveNorth(player);
//                break;
//            case 'A':
//                moveEast(player);
//                break;
//            case 'S':
//                moveSouth(player);
//                break;
//            case 'D':
//                moveWest(player);
//                break;
            case 'M':
                openMap(map);
                break;
            case 'I':
                openInventory();
                break;
            case 'E':
                interactWithEnvironment();
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
                    + "\n* M - Map                                                 *"
                    + "\n* I - Inventory                                           *"
                    + "\n* E - Interact With Enviroment                            *"
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
    public void openMap(Map map) {
        MapView mapView = new MapView();
        mapView.display();
    }

    public void openInventory() {
        InventoryView openInventory = new InventoryView();
        openInventory.display();

    }

    private void interactWithEnvironment() {
        InteractWithEnviromentView interactWithEnvironment = new InteractWithEnviromentView();
        interactWithEnvironment.display();

    }

    public void displayGameMenuView() {
        MainMenuView displayGameMenu = new MainMenuView();
    }
}
