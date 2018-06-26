package view;

import control.GameControl;
import escapeIsland.EscapeIsland;
import model.Player;
import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class MainMenuView extends View {

    public MainMenuView() {

    }

    public String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println("***********************************************************"
                + "\n***********************************************************"
                + "\n*                                                         *"
                + "\n* N - New Game                                            *"
                + "\n* L - Load Game                                           *"
                + "\n* H - Help                                                *"
                + "\n* Q - Quit                                                *"
                + "\n*                                                         *"
                + "\n***********************************************************"
                + "\n***********************************************************");

        String[] menuItem = new String[1];
        Scanner sc = new Scanner(System.in);
        menuItem[0] = sc.nextLine();

        return menuItem;
    }

    @Override
    public boolean doAction(String[] inputs) {

        char c = inputs[0].trim().toUpperCase().charAt(0);
        switch (c) {
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Option.");
        }

        return false;

    }

    private void startNewGame() {
        int returnValue = GameControl.createNewGame(EscapeIsland.getPlayer());
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create new game");
        }
    }

    private void loadGame() {
        System.out.println("Load a game.");
    }

    private void helpMenu() {
        HelpMenuView help = new HelpMenuView();
        help.display();

    }

}
