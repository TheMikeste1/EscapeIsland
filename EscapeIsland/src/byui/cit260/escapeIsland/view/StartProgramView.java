/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeIsland.view;

/**
 *
 * @author collin
 */
public class StartProgramView {

    private static String[] getInputs() {
    System.out.println("**** getInputs() called ****");
    String[] inputs = new String[1];
    
        System.out.println("description of view");
        
    boolean valid = false;
        while (valid == false) {
            System.out.println("prompt message");
            
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
       String[] inputs=getInputs();
        System.out.println("input name");
        if (inputs[0].length() < 1 || inputs[0].equals('Q')){ 
            return;}
        endOfView = doAction(inputs);
        } while (endOfView != true);
        
    }
  
  
}

