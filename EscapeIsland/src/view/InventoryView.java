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
    
    private static Actor player;

    public String[] getInputs() {
        String[] inputs = new String[1];

        displayInventory();

        String[] menuItem = new String[1];
        Scanner sc = new Scanner(System.in);
        menuItem[0] = sc.nextLine().trim();

        return inputs;
    }
    
    public boolean doAction(String inputs) {

        String c = inputs.trim().toUpperCase();
        int selection = Integer.parseInt(c);
        
        Item item = InventoryView.player.getActorItems().get(selection);
        if (item == null) {
            System.out.println("Item does not exist in inventory");
            return false;
        }
        
        int result = InventoryControl.equipItem(InventoryView.player, item);
         if (result < 0) {
             System.out.println("player or item does not exist");
             return false;
                }
          
        
         else System.out.println("Your player now has the " + item.getItemName() + "in his hands");

        return true;
    }

    private void displayInventory() {

        // Temporary until we create the Actor for the player
        InventoryView.player = Actor.PrisonGuard;
        ArrayList<Item> inventory = InventoryView.player.getActorItems();

        inventory.add(Item.ToolKit);
        inventory.add(Item.Axe);
        inventory.add(Item.Axe);
        inventory.add(Item.Sword);
        

        // --- End of to do later
        System.out.println(
                       "***********************************************************"
                    + "\n***********************************************************"
                    + "\n*                                                         *"
                    + "\n*                    Inventory Menu                       *");
       
        
        System.out.println("* ");
        int num = 0;
        for (Item item : inventory) {

            num++; // add one to item number
            System.out.println(num + " - " + item.getItemName());
        }
        
        System.out.println(
                         "\n* Q - Quit to Game Menu                                   *"
                       + "\n*                                                         *"
                       + "\n***********************************************************"
                       + "\n***********************************************************");
    }


}
