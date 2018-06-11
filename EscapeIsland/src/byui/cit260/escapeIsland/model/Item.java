/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeIsland.model;

import java.io.Serializable;

/**
 *
 * @author collin
 */
public enum Item implements Serializable {

    Axe("Axe", "Weapon", "A sharp battle axe", "Swing", 4, 3),
    Sword("Sword", "Weapon", "An elegant short sword", "Jab", 3, 4),
    ToolKit("ToolKit", "Tool", "A small collection of every-day tools", "Fix",1,1),
    Compass("MagicCompass", "Tool", "A glowing, ancient ","locate", 0,0);
    
    private final String itemName;
    private final String itemType;
    private final String itemDescription;
    private final String itemAbility;
    private final int attack;
    private final int defense;


    
    private Item(String itemName, String itemType, String itemDescription, String itemAbility, int attack, int defense) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemDescription = itemDescription;
        this.itemAbility = itemAbility;
        this.attack = attack;
        this.defense = defense;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemAbility() {
        return itemAbility;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", itemType=" + itemType + ", itemDescription=" + itemDescription + ", itemAbility=" + itemAbility + ", attack=" + attack + ", defense=" + defense + '}';
    }
    
    
    
}
