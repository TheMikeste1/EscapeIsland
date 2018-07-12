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
import escapeIsland.EscapeIsland;
import exceptions.InventoryControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Collin
 */
public class InventoryView extends View {
    
    
    
    public InventoryView() {
}
    
    public boolean doAction(String[] inputs) {

        try {
            String c = inputs[0].trim().toUpperCase();
            
            Item itemSelected = null;
//        int selection = Integer.parseInt(c);
//        Item item = Actor.PrisonGuard.getActorItems().get(selection);
switch(c) {
    case "1": itemSelected = Item.Bat; break;
    case "2": itemSelected = Item.Buckler; break;
    case "3": itemSelected = Item.Compass; break;
    case "4": itemSelected = Item.CrockpotLid; break;
    case "5": itemSelected = Item.HamRadioManual; break;
    case "6": itemSelected = Item.Key; break;
    case "7": itemSelected = Item.KiteShield; break;
    case "8": itemSelected = Item.Lantern; break;
    case "9": itemSelected = Item.LeadPipe; break;
    case "10": itemSelected = Item.Microphone; break;
    case "11": itemSelected = Item.PantryDoor; break;
    case "12": itemSelected = Item.Stick; break;
    case "13": itemSelected = Item.Sword; break;
    case "14": itemSelected = Item.ToolKit; break;
    case "15": itemSelected = Item.solderingIron; break;
    case "G": {
        try {
            InventoryControl.equipItem(EscapeIsland.getCurrentGame().getPlayer().getActor(),InventoryControl.checkBestItem(EscapeIsland.getCurrentGame().getPlayer().getActor()));
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }
    }
    {
        try {
            System.out.println(InventoryControl.checkBestItem(EscapeIsland.getCurrentGame().getPlayer().getActor()));
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }
    }
    break;
    case "Q": return true;
    
//
}

if (!Actor.Hero.getActorItems().contains(itemSelected)) {
    System.out.println("Item does not exist in inventory");
    return false;
}

int result = InventoryControl.equipItem(Actor.Hero, itemSelected);
if (result < 0) {
    System.out.println("player or item does not exist");
    return false;
}


else System.out.println("You now have the " + itemSelected.getItemName() + " in your hands");
return true;

        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
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
        int num = 0;
        for (Item item : inventory) {

            num++; // add one to item number
            System.out.println(num + " - " + item.getItemName());
        }
        
        System.out.println("\n* G - Equip Best Item");
        
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
