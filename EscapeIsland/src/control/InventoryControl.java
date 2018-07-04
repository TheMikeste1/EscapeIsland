/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author collin
 */
public class InventoryControl {
    
    
    public static void displayInventory(Actor player) {
        
        for(int i=0;i<player.getActorItems().size();i++)  {
            System.out.println(player.getActorItems().get(i).getItemName());
        } 
        
}
    
    
    
    public static int equipItem(Actor player, Item thing) {
        // check for invalid inpuits
         if (player == null){
             System.out.println("player does not exist");
             return -1;}
         
         if (thing == null) {
             System.out.println("item does not exist");
             return -2;}
         
        
        // set selected item to current item in the player actor
        player.setCurrentItem(thing);
        return 1;
        
    }
    
    public static Item checkBestItem(Actor mark) {
        ArrayList<Item> items = mark.getActorItems();
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
