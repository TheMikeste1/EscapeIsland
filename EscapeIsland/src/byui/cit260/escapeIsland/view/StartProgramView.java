/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeIsland.view;

import java.util.Scanner;

/**
 *
 * @author collin
 */
public class StartProgramView {

    private static String[] getInputs() {
        System.out.println("**** getInputs() called ****");
        String[] inputs = new String[1];

        inputs = new String[1];

        System.out.println("description of view");

        boolean valid = false;
        while (valid == false) {
            System.out.println("prompt message");
            String[] getName = new String[5];
            Scanner sc = new Scanner(System.in);
            getName[0] = sc.nextLine();
            System.out.println(getName[0]);

            String yourName = getName[0].trim();
            if (yourName.length() < 1) {
                System.out.println("You must enter a non-blank value");

                continue;
            }
            valid = true;
            inputs[0] = yourName;
        }

        return inputs;
    }

    private static boolean doAction(String[] inputs) {
        System.out.println("****doAction called ****");
        System.out.println("\tinputs = " + inputs[0]);

        return true;
    }

    public StartProgramView() {

    }

    public static void displayStartProgramView() {

        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            System.out.println("input name");
            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                return;
            }
            else if (inputs[0].length() < 1 || inputs[0].equals('q')) {
                return;
            
                
            }
            
               
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }

}