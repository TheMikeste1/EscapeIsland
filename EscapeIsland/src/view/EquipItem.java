/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import exceptions.InventoryControlException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author Collin
 */
public class EquipItem {

    private String[] getInputs() {
        String[] inputs = new String[1];

        //inputs = new String[1];

        System.out.println("***********************************************************"
                       + "\n***********************************************************"
                       + "\n*                                                         *"
                       + "\n*                    Inventory Menu                       *"
                       + "\n* P - Display Inventory                                   *"
                       + "\n* E - Equip Item                                          *"
                       + "\n* Q - Quit to Game Menu                                   *"
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
                case 'P':
                    displayInventory();
                    break;
                case 'E':
                    equipItem();
                    break;
                case 'Q':
                    return true;
                default: 
                    System.out.println("Invalid Option");
            }


        return false;
    }
   


    private void displayInventory() {
        
        
        InventoryControl inventorycontrol = new InventoryControl();
        Actor ralph = Actor.PrisonGuard;
        ArrayList<Item> inventory = new ArrayList();
        inventory.add(Item.ToolKit);
        inventory.add(Item.Stick);
        inventory.add(Item.LeadPipe);
        inventory.add(Item.Sword);
        ralph.setActorItems(inventory);
        
        try {
            inventorycontrol.displayInventory(ralph);
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }
     }
    
    private void equipItem() {
        
        InventoryControl inventorycontrol = new InventoryControl();
        Actor max = Actor.MonsterZombie;
        
        ArrayList<Item> inventory = new ArrayList();
        inventory.add(Item.Sword);
        inventory.add(Item.Compass);
        inventory.add(Item.ToolKit);
        max.setActorItems(inventory);
        try {
            inventorycontrol.displayInventory(max);
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            inventorycontrol.equipItem(max, Item.ToolKit);
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Item Currently Equipped:");
        System.out.println(max.getCurrentItem().getItemName());
}
}