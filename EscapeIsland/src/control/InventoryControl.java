/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
        // if player is null then
            // return -1
        // end if 
        // if thing is null then
            // return -2
        // endif 
        
        // set selected item to current item in the player actor
        player.setCurrentItem(thing);
        return 1;
        
    }




}
