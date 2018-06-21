/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Austin
 */
public abstract interface ViewInterface {
    abstract String[] getInputs();
   
    abstract boolean doAction(String inputs);

    abstract void display();
    
    abstract String getInput(String promptMessage);
    
}   
