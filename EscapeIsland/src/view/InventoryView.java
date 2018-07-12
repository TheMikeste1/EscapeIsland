/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.*;
import control.InventoryControl;
import escapeIsland.EscapeIsland;
import exceptions.InventoryControlException;
import static java.lang.Integer.parseInt;
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

        String c = inputs[0].trim().toUpperCase();
        Actor currentPlayer = EscapeIsland.getCurrentPlayer().getActor();
        Item itemSelected = null;
//        int selection = Integer.parseInt(c);
//        Item item = Actor.PrisonGuard.getActorItems().get(selection);
        switch (c) {
            case "G": {
                try {
                    InventoryControl.equipItem(EscapeIsland.getCurrentGame().getPlayer().getActor(), InventoryControl.checkBestItem(EscapeIsland.getCurrentGame().getPlayer().getActor()));
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
            case "Q":
                return true;
                
            default: {
                int num = 0;
                try {
                    num = parseInt(c);
                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
               
                }
            try {
                InventoryControl.equipItem(currentPlayer,currentPlayer.getActorItems().get(num-1));
                System.out.println(currentPlayer.getActorItems().get(num-1).getItemName() + " equipped!");
            } catch (InventoryControlException ex) {
                System.out.println(ex.getMessage());
            }
            }

//
            }

        return false;
    }

    public String[] getInputs() {

        // Temporary until we create the Actor for the player
        Actor player = Actor.Hero;
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

    public static void equipItem(Actor actor, Item item) {
        try {

            InventoryControl.equipItem(actor, item);

            System.out.println("You now have the " + item.getItemName() + " in your hands");

        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
