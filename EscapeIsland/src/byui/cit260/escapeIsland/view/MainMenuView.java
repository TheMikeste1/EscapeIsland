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
            // System.out.println("input name");
            
            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                endOfView = true;   
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }

    private String[] getInputs() {
       String[] inputs = new String[1];

        inputs = new String[1];

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
           
            
            while(menuItem[0].toUpperCase().charAt(0) != 'N' 
                    && menuItem[0].toUpperCase().charAt(0) != 'L' 
                    && menuItem[0].toUpperCase().charAt(0) != 'H' 
                    && menuItem[0].toUpperCase().charAt(0) !='Q' ){
                         System.out.println("Enter a valid letter.");
                         menuItem[0] = sc.nextLine();
            }
      return menuItem; 
    } 

    private boolean doAction(String[] inputs) {
        
    char c = inputs[0].trim().toUpperCase().charAt(0);
        switch(c){
            case 'N':
                sng();
                break;
            case 'L':
                lg();
                break;
            case 'H':
                hm();
                break;
            case 'Q':
                break;  
        }
        
        return true;    

    }

    private void sng() {
        System.out.println("Start a new game");
    }

    private void lg() {
        System.out.println("Load a game");
    }

    private void hm() {
        HelpMenuView help = new HelpMenuView();
        help.displayHelpMenuView();
    }
    
}
