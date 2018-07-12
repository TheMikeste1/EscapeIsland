package view;

import model.Map;
import escapeIsland.EscapeIsland;

/**
 *
 * @author Austin
 */
public class GameMenuView extends View {

    public boolean doAction(String[] inputs) {

        Map map = EscapeIsland.getCurrentGame().getMap();
        char c = inputs[0].trim().toUpperCase().charAt(0);
//
        switch (c) {
            case 'I':
                openInventory();
                break;
            case 'E':
                interactWithEnvironment();
                break;
            case 'M':
                moveToNewLocation();
                break;
//            case 'R':
//                riddleHints();
//                break;
            case 'H':
                HelpMenuView help = new HelpMenuView();
                help.display();
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
                    + "\n* I - Inventory                                           *"
                    + "\n* E - Interact With Enviroment                            *"
                    + "\n* M - Move to new location                                *"
                    + "\n* H - Help                                                *"
                    + "\n* Q - Quit to Main Menu                                   *"
                    + "\n*                                                         *"
                    + "\n***********************************************************"
                    + "\n***********************************************************");

            return inputs;
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
        InteractWithEnviromentView interactWithEnvironment = new InteractWithEnviromentView();
        interactWithEnvironment.display();

    }

    public void displayGameMenuView() {
        MainMenuView displayGameMenu = new MainMenuView();
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

//    private void riddleHints() {
//        // display a list of all the riddles, and the answers.
//        EscapeIsland.getCurrentGame().riddleArrayList();
//    }

}
