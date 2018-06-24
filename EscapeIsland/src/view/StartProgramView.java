package view;

import control.GameControl;
import model.Player;
import java.util.Scanner;

/**
 *
 * @author collin
 */
public class StartProgramView extends View {

    public StartProgramView() {

    }

    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = this.getInput("***********************************************************"
                + "\n***********************************************************"
                + "\n*                                                         *"
                + "\n*                       Escape Island                     *"
                + "\n* In this game you will escape from an island and try to  *"
                + "\n* understand is happening. Your wits and your survival    *"
                + "\n* skill will be tested to the limit, will you escape?     *"
                + "\n*                                                         *"
                + "\n*                                                         *"
                + "\n*                                                         *"
                + "\n*   Please enter your name                                *"
                + "\n***********************************************************"
                + "\n***********************************************************");

        return inputs;
    }

    public boolean doAction(String[] inputs) {

        String[] playersName = inputs;
        Player player = GameControl.savePlayer(playersName[0]);

        if (player == null) {
            System.out.println("Could not create the player. "
                    + "Enter a diferent name.");
            return false;
        }
        System.out.println("==========================================================="
                + "\n==========================================================="
                + "\n                                                           "
                + "\nWelcome to the game " + playersName + ". "
                + "\nWe hope you have a lot of fun!                             "
                + "\n                                                           "
                + "\n==========================================================="
                + "\n===========================================================");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;
    }

    private static Player savePlayer(String playersName) {
        System.out.println("*** calling savePlayer ***");
        return null;
    }

}
