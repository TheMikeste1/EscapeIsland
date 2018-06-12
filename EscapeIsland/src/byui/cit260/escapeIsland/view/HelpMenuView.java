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

        System.out.println("***************************"
                + "\n C - Controls            "
                + "\n S - Story so far        "
                + "\n H - Hints               "
                + "\n B - Battle System       "
                + "\n Q - Quit to Main Menu   "
                + "\n please select an option "
                + "\n*************************");

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
                   theBattleSystem();
                    break;
                case 'Q':
                    return true;
                default: 
                    System.out.println("Invalid Option");
            }


        return false;
    }
    private void theBattleSystem() {
        System.out.println("The Battle System,"
                + "\nAttack = Player Attack + Player Item - Enemy Defense"
                + "\nTurn Order = Player Speed + Player Item / Enemy Speed  +"
                + "\nCritical Hit Chance = Player Attack + Player Item + Player Speed + Item Speed / 100. "
                + "\nDefend = Reduce damage by 50% "
                + "\nItem = Use an Combat Item "
                + "\nRun = Flee the battle.");
                return; 
    }
    private void hints() {
        System.out.println("hints, what you should do next. ");
    }
}
