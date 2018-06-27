/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import java.util.ArrayList;
import java.util.Scanner;
import model.*;
import control.InventoryControl;

/**
 *
 * @author Collin
 */
public class InventoryView extends View {
    
    
    
    public InventoryView() {
}
    
    public boolean doAction(String[] inputs) {

        String c = inputs[0].trim().toUpperCase();
        int selection = Integer.parseInt(c);
        
        Item item = Actor.PrisonGuard.getActorItems().get(selection);
        if (item == null) {
            System.out.println("Item does not exist in inventory");
            return false;
        }
        
        int result = InventoryControl.equipItem(Actor.PrisonGuard, item);
         if (result < 0) {
             System.out.println("player or item does not exist");
             return false;
                }
          
        
         else System.out.println("You now have the " + item.getItemName() + " in your hands");

        return true;
    }

    public String[] getInputs() {

        // Temporary until we create the Actor for the player
        Actor player = Actor.PrisonGuard;
        ArrayList<Item> inventory = player.getActorItems();

        inventory.add(Item.ToolKit);
        inventory.add(Item.LeadPipe);
        inventory.add(Item.KiteShield);
        inventory.add(Item.Sword);
        

        // --- End of to do later
        System.out.println(
                       "***********************************************************"
                    + "\n***********************************************************"
                    + "\n*                                                         *"
                    + "\n*                    Inventory Menu                       *");
       
        
        System.out.println("* ");
        int num = -1;
        for (Item item : inventory) {

            num++; // add one to item number
            System.out.println(num + " - " + item.getItemName());
        }
        
        System.out.println(
                         "\n* Q - Quit to Game Menu                                   *"
                       + "\n*                                                         *"
                       + "\n***********************************************************"
                       + "\n***********************************************************");
        String[] inputs = new String[1];
        inputs[0] = getInput("");
        return inputs;
    }




}
