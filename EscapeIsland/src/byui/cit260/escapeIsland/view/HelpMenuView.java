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

            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                endOfView = true;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }

    private String[] getInputs() {
        String[] inputs = new String[1];

        inputs = new String[1];

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
        
        while(menuItem[0].toUpperCase().charAt(0) != 'C' 
                && menuItem[0].toUpperCase().charAt(0) != 'S' 
                && menuItem[0].toUpperCase().charAt(0) != 'H'
                && menuItem[0].toUpperCase().charAt(0) != 'B' 
                && menuItem[0].toUpperCase().charAt(0) !='Q' ){
                    System.out.println("Enter a valid letter.");
                    menuItem[0] = sc.nextLine();
            }
      return menuItem;

    }

    private boolean doAction(String[] inputs) {

        char c = inputs[0].trim().toUpperCase().charAt(0);

        boolean valueOne = false;
        while (valueOne == false) {

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
                    System.out.println("Hints");
                    displayHelpMenuView();
                    break;
                case 'B':
                    System.out.println("The battle system");
                    displayHelpMenuView();
                    break;
                case 'Q':
                    MainMenuView display = new MainMenuView();
                    display.displayMainMenuView();
                    valueOne = true;
                    break;
            }

        }

        return true;
    }
}
