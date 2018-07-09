package view;

import control.GameControl;
import model.Player;
import java.util.Scanner;
import escapeIsland.EscapeIsland;

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
                + "\n*                                                         *"
                + "\n*                                                         *"
                + "\n***********************************************************"
                + "\n***********************************************************");

        return inputs;
    }

    
    public boolean doAction(String[] inputs) {
        
        if (inputs[0] == null) {
            System.out.println("Could not create the player. "
                    + "Enter a diferent name.");
            return false;
        }
        
        Player player = GameControl.savePlayer(inputs[0]);
        System.out.println("==========================================================="
                + "\n==========================================================="
                + "\n                                                           "
                + "\nWelcome to the game " + player.getPlayersName() + ". "
                + "\nWe hope you have a lot of fun!                             "
                + "\n                                                           "
                + "\n==========================================================="
                + "\n===========================================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
     
        return true;
    }

}
