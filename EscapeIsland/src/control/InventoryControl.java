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
    
    public void displayInventory(Actor player) {
        
        for(int i=0;i<player.getActorItems().size();i++)  {
            System.out.println(player.getActorItems().get(i).getItemName());
        } 
        
}
    
    
    
    public void equipItem(Actor player, Item thing) {
        player.setCurrentItem(thing);
    }




}
