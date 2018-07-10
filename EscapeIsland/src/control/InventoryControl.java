/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.InventoryControlException;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author collin
 */
public class InventoryControl {
    
    
    public static void displayInventory(Actor player) 
        throws InventoryControlException{
        if (player == null) {
            throw new InventoryControlException("actor is null");
        }
        for(int i=0;i<player.getActorItems().size();i++)  {
            System.out.println(player.getActorItems().get(i).getItemName());
        } 
        
}
    
    
    
    public static int equipItem(Actor player, Item thing)
           throws InventoryControlException {
        // check for invalid inpuits
         if (player == null){
             throw new InventoryControlException("actor is null");
             }
         
         if (thing == null) {
             throw new InventoryControlException("item does not exist");
             }
         
        
        // set selected item to current item in the player actor
        player.setCurrentItem(thing);
        return 1;
        
    }
    
    public static Item checkBestItem(Actor mark)
        throws InventoryControlException {
        
        if (mark == null) {
            throw new InventoryControlException ("actor is null");
        }
        ArrayList<Item> items = mark.getActorItems();
        if (items.size() < 1) {
            throw new InventoryControlException ("no items in inventory");
        }
        Item bestItem = items.get(0);
        for(int i = 0; i<items.size(); i++) {
            int power = items.get(i).getAttack() + items.get(i).getDefense();
            if(power > (bestItem.getAttack() + bestItem.getDefense())) {
                bestItem = items.get(i);
            }
        }
        
        System.out.println(bestItem.getItemName());
        
        return bestItem;
        
        
    }




}
