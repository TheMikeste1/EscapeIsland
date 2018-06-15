/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.*;

/**
 *
 * @author Austi
 */
public class InteractWithEnviromentView {
        Actor max = Actor.MonsterZombie;
    
    public void displayInteractWithEnviromentVie() {

        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            // System.out.println("input name");

            if (inputs[0].trim().length() < 1 || inputs[0].equals('Q')) {
                endOfView = true;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];

        //inputs = new String[1];

        System.out.println("***********************************************************"
                       + "\n***********************************************************"
                       + "\n*                                                         *"
                       + "\n* Interactions                                            *"
                       + "\n*                                                         *"
                       + "\n* C - Combat                                              *"
                       + "\n* I - Item Required                                       *"
                       + "\n* L - Loot                                                *"
                       + "\n* T - Talk                                                *"
                       + "\n* P - Puzzle                                              *"
                       + "\n* R - Riddle                                              *"       
                       + "\n* Q - Quit to Game Menu                                   *"
                       + "\n*                                                         *"
                       + "\n***********************************************************"
                       + "\n***********************************************************");

        String[] menuItem = new String[1];
        Scanner sc = new Scanner(System.in);
        menuItem[0] = sc.nextLine();
        
      return menuItem;
    }
    
    private boolean doAction(String[] inputs) {

        char interactionsMenu = inputs[0].trim().toUpperCase().charAt(0);

            switch (interactionsMenu) {
                case 'C':
                    combatControls();
                    break;
                case 'I':
                    itemRequired();
                    break;
                case 'L':
                    getLoot();
                    break;
                case 'T':
                    talkToNPC();
                    break;
                case 'P':
                    puzzle();
                    break;
                case 'R':
                    riddle();
                    break;
                case 'Q':
                    return true;
                default: 
                    System.out.println("Invalid Option");
            }


        return false;
    }

    private void combatControls() {
                System.out.println("\n***********************************************************"
                                 + "\n***********************************************************"
                                 + "\n*                                                         *"
                                 + "\n* Combat                                                  *"
                                 + "\n*                                                         *"
                                 + "\n*A - Attack                                               *"
                                 + "\n*D - Defend                                               *"
                                 + "\n*I - Item                                                 *"
                                 + "\n*F - Flee                                                 *"
                                 + "\n*                                                         *"
                                 + "\n***********************************************************"
                                 + "\n***********************************************************");
                return; 
    }

    private void itemRequired() {
        if(max.getCurrentItem() != Item.ToolKit){
                System.out.println("\n***********************************************************"
                                 + "\n***********************************************************"
                                 + "\n*                                                         *"
                                 + "\n*The " + Item.ToolKit + " is required to progress.        *"
                                 + "\n*                                                         *"
                                 + "\n***********************************************************"
                                 + "\n***********************************************************");
                return; 
        }else
            System.out.println("\n***********************************************************"
                             + "\n***********************************************************"
                             + "\n*                                                         *"
                             + "\n*The " + Item.ToolKit + " allowed you to progress.        *"
                             + "\n*                                                         *"
                             + "\n***********************************************************"
                             + "\n***********************************************************");
    }

    private void getLoot() {
                System.out.println("\n***********************************************************"
                                 + "\n***********************************************************"
                                 + "\n*                                                         *"
                                 + "\n*Congradulations you have obtained " + Item.Axe +"        *"
                                 + "\n*                                                         *"
                                 + "\n***********************************************************"
                                 + "\n***********************************************************");
                return; 
    }

    private boolean talkToNPC() {
            String[] inputs = getInputs();
            char chatOptions = inputs[0].trim().toUpperCase().charAt(0);
                
                switch (chatOptions) {
                    
                    case 'A':
                        optionAChat();
                        break;
                    
                    case 'B':
                        optionBChat();
                        break;
                    
                    case 'C':
                        optionCChat();
                        break;
                    
                    case 'D':
                        optionDChat();
                        break;
                    
                    case 'Q':
                        return true;
                    
                    default:
                        System.out.println("Invalid Option");
                    
                }
                    
                return false; 
    }

    private void puzzle() {
                System.out.println("\n***********************************************************"
                                 + "\n***********************************************************"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n***********************************************************"
                                 + "\n***********************************************************");
                return; 
    }

    private void riddle() {
                System.out.println("\n***********************************************************"
                                 + "\n***********************************************************"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n*                                                         *"
                                 + "\n***********************************************************"
                                 + "\n***********************************************************");
                return; 
    }

    private void optionAChat() {
        System.out.println("");

    }

    private void optionBChat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void optionCChat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void optionDChat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
