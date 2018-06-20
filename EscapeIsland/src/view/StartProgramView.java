package view;

import control.GameControl;
import model.Player;
import java.util.Scanner;

/**
 *
 * @author collin
 */
public class StartProgramView {

    private static String[] getInputs() {

        String[] inputs = new String[1];

        displayStartProgramView();
        
        System.out.println("***********************************************************"
                       + "\n***********************************************************"
                       + "\n*                                                         *"
                       + "\n*                       Escape Island                     *"
                       + "\n* In this game you will escape from an island and try to  *"
                       + "\n* understand is happening. Your wits and your survival    *"
                       + "\n* skill will be tested to the limit, will you escape?     *"
                       + "\n*                                                         *"
                       + "\n***********************************************************"
                       + "\n***********************************************************");
        
        inputs[0] = this.getInput("Please enter you name");

        return inputs;
    }

    private static boolean doAction(String[] inputs) {

        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);

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
        mainMenuView.displayMainMenuView();
        return true;
    }

    private static Player savePlayer(String playersName) {
        System.out.println("*** calling savePlayer ***");
         return null;
    }

   public StartProgramView() {

    }

    public static void displayStartProgramView() {

        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            // System.out.println("input name");

            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                endOfView = true;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }
    
    

    
}
