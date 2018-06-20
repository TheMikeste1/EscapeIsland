/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Austin
 */
public abstract class View implements ViewInterface {
    
    public View(){ 
    }
    
    @Override
    public void display() {

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
    
    @Override
    public String getInput(String promptMessage) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        String value = "";
        
        while (valid == false) {
            System.out.println(promptMessage);
            value = sc.nextLine();
            
            value = value.trim();
            System.out.println("");
            if (value.length() < 1) {
                System.out.println("You must enter a non-blank value");

                continue;
            }
            valid = true;
            
        }
        return value;
    }
}
