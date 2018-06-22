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
   
    protected String options;
    
    public View(){ 
    }
    
    
   public String[] getInputs(){
       String[] thing = {"Herp", "Derp"};
       return thing;
   }
    
    
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
    
    
    
    
    public void display() {

        boolean endOfView = false;
        do {
            
            String inputs = getInput(options);
            // System.out.println("input name");

            if (inputs.length() < 1 || inputs.equals("Q")) {
                endOfView = true;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }
}
