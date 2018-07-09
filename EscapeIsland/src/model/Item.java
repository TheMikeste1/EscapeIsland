/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author collin
 */
public enum Item implements Serializable {

    // combat items
    Stick("Stick", "Weapon", "A study peice of oak", "Attack", 1, 0 ),
    LeadPipe("Lead Pipe", "Weapon", "A decaying peice of construction", "Attack", 2,0 ),
    Bat("Bat", "Weapon", "A standard baseball bat", "Attack", 3,0 ),
    Sword("Sword", "Weapon", "A medieval longsword", "Attack", 4,0 ),
    
    CrockpotLid("Crock-pot Lid", "Shield", "A old crock-pot lid", "Defense", 0,1 ),
    PantryDoor("Pantry Door", "Shield", "Half of a pantry door", "Defense", 0,2 ),
    Buckler("Buckler", "Shield", "A small wooden shield", "Defense", 0,3 ),
    KiteShield("Kite Shield", "Shield", "A full metal kite shield", "Defense", 0,4 ),
   
    
    // tools
    ToolKit("ToolKit", "Tool", "A small collection of every-day tools", "Fix",0,0),
    Compass("MagicCompass", "Tool", "A glowing, ancient ","locate", 0,0),
    Lantern("Lantern","Tool","Lights dark places","Light",  0,0 ),
    Key("Key","Tool","Unlocks the prison","Unlock",  0,0 ),
    HamRadioManual("Ham Radio Manual","Tool", "Teaches you how to use the radio","Learn",  0,0 ),
    Microphone("Microphone","Tool","Allows your voice to reach far places","RadioPartOne",  0,0 ),
    solderingIron("Smoldering Iron","Tool","Allows you to weld items together","RadioPartTwo",  0,0 );
    
    
    private final String itemName;
    private final String itemType;
    private final String itemDescription;
    private final String itemAbility;
    private final int attack;
    private final int defense;
    private Point actorcoordinates;


    
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
