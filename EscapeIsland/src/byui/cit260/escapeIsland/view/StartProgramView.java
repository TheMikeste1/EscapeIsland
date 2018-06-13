package byui.cit260.escapeIsland.view;

import byui.cit260.escapeIsland.model.Player;
import java.util.Scanner;

/**
 *
 * @author collin
 */
public class StartProgramView {

    private static String[] getInputs() {

        String[] inputs = new String[1];

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
        boolean valid = false;

        while (valid == false) {
            System.out.println("Enter the player's name below:");
            String[] getName = new String[1];
            Scanner sc = new Scanner(System.in);
            getName[0] = sc.nextLine();

            String yourName = getName[0].trim();
            System.out.println("");
            if (yourName.length() < 1) {
                System.out.println("You must enter a non-blank value");

                continue;
            }
            valid = true;
            inputs[0] = yourName;
            inputs[0] = inputs[0].toUpperCase();
        }

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
