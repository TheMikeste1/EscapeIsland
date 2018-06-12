/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeIsland.view;

import byui.cit260.escapeIsland.model.Player;
import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class MainMenuView {

    public void displayMainMenuView() {

        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].trim().length() < 1) {
                System.out.println("error");
                continue;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);
    }

    private String[] getInputs() {
       String[] inputs = new String[1];

       System.out.println("*****************"
                          +"\n N - New Game  "
                          +"\n L - Load Game "
                          +"\n H - Help      "
                          +"\n Q - Quit      "
                          +"\n please select an option"
                          +"\n***************");
        

        
            String[] menuItem = new String[1];
            Scanner sc = new Scanner(System.in);
            menuItem[0] = sc.nextLine();
           
            
             return menuItem;  
            }


     

    private boolean doAction(String[] inputs) {
        
    char c = inputs[0].trim().toUpperCase().charAt(0);
        switch(c){
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
                System.out.println("Invalid Option");
        }
        
        return false;    

    }

    private void startNewGame() {
        System.out.println("Start a new game");
    }

    private void loadGame() {
        System.out.println("Load a game");
    }

    private void helpMenu() {
        HelpMenuView help = new HelpMenuView();
        help.displayHelpMenuView();
    }
    
}
