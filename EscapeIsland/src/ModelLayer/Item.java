/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author collin
 */
public class Item implements Serializable {

    public Item() {
    }
    
    private String itemName;
    private String itemType;
    private String itemDescription;
    private String itemAbility;
    private int attack;
    private int defense;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemAbility() {
        return itemAbility;
    }

    public void setItemAbility(String itemAbility) {
        this.itemAbility = itemAbility;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.itemName);
        hash = 89 * hash + Objects.hashCode(this.itemType);
        hash = 89 * hash + Objects.hashCode(this.itemDescription);
        hash = 89 * hash + Objects.hashCode(this.itemAbility);
        hash = 89 * hash + this.attack;
        hash = 89 * hash + this.defense;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.attack != other.attack) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        if (!Objects.equals(this.itemAbility, other.itemAbility)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", itemType=" + itemType + ", itemDescription=" + itemDescription + ", itemAbility=" + itemAbility + ", attack=" + attack + ", defense=" + defense + '}';
    }
    
    
    
}
