/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeIsland.view;

import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class HelpMenuView {

    public void displayHelpMenuView() {

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
                       + "\n* C - Controls                                            *"
                       + "\n* S - Story so far                                        *"
                       + "\n* H - Hints                                               *"
                       + "\n* B - Battle System                                       *"
                       + "\n* Q - Quit to Main Menu                                   *"
                       + "\n*                                                         *"
                       + "\n***********************************************************"
                       + "\n***********************************************************");

        String[] menuItem = new String[1];
        Scanner sc = new Scanner(System.in);
        menuItem[0] = sc.nextLine();
        
      return menuItem;
    }

    private boolean doAction(String[] inputs) {

        char c = inputs[0].trim().toUpperCase().charAt(0);

            switch (c) {
                case 'C':
                    System.out.println("Open the controls");
                    displayHelpMenuView();
                    break;
                case 'S':
                    System.out.println("The Story so far");
                    displayHelpMenuView();
                    break;
                case 'H':
                    hints();
                    break;
                case 'B':
                    battleSystem();
                    break;
                case 'Q':
                    return true;
                default: 
                    System.out.println("Invalid Option");
            }


        return false;
    }
    private void battleSystem() {
        System.out.println("\n***********************************************************"
                         + "\n***********************************************************"
                         + "\n*                                                         *"
                         + "\n*                 The Battle System                       *"
                         + "\n* Attack     = Player Attack + Player Item - Enemy Defense*"
                         + "\n* Turn Order = Player Speed + Player Item / Enemy Speed  +*"
                         + "\n* Critical   = Player Attack + Player Item + Player Speed *"
                         + "\n* + Item Speed / 100.                                     *"
                         + "\n* Defend     = Reduce damage by 50%                       *"
                         + "\n* Item       = Use an Combat Item                         *"
                         + "\n* Run        = Flee the battle.                           *"
                         + "\n*                                                         *"
                         + "\n***********************************************************"
                         + "\n***********************************************************");
                return; 
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
}
