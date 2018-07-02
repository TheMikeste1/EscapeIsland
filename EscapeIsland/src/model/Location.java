/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import control.MapControl;

/**
 *
 * @author Austin
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private boolean visited; 
    private boolean complete;
    private String description;
    private BackgroundType backgroundType;
    private boolean blocked;
    
    private Actor enemy;
    private Riddle riddle; 
    private Item itemRequired;
    private Item obtainItem;
    private Actor talkToNPC;
    
    public Location() {
    }

    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BackgroundType getBackgroundType() {
        return backgroundType;
    }

    public void setBackgroundType(BackgroundType backgroundType) {
        this.backgroundType = backgroundType;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public Actor getEnemy() {
        return enemy;
    }

    public void setEnemy(Actor enemy) {
        this.enemy = enemy;
    }

    public Riddle getRiddle() {
        return riddle;
    }

    public void setRiddle(Riddle riddle) {
        this.riddle = riddle;
    }

    public Item getItemRequired() {
        return itemRequired;
    }

    public void setItemRequired(Item itemRequired) {
        this.itemRequired = itemRequired;
    }

    public Item getObtainItem() {
        return obtainItem;
    }

    public void setObtainItem(Item obtainItem) {
        this.obtainItem = obtainItem;
    }

    public Actor getTalkToNPC() {
        return talkToNPC;
    }

    public void setTalkToNPC(Actor talkToNPC) {
        this.talkToNPC = talkToNPC;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.row;
        hash = 23 * hash + this.column;
        hash = 23 * hash + (this.visited ? 1 : 0);
        hash = 23 * hash + (this.complete ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.backgroundType);
        hash = 23 * hash + (this.blocked ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.enemy);
        hash = 23 * hash + Objects.hashCode(this.riddle);
        hash = 23 * hash + Objects.hashCode(this.itemRequired);
        hash = 23 * hash + Objects.hashCode(this.obtainItem);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.complete != other.complete) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.backgroundType != other.backgroundType) {
            return false;
        }
        if (this.enemy != other.enemy) {
            return false;
        }
        if (!Objects.equals(this.riddle, other.riddle)) {
            return false;
        }
        if (this.itemRequired != other.itemRequired) {
            return false;
        }
        if (this.obtainItem != other.obtainItem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", complete=" + complete + ", description=" + description + ", backgroundType=" + backgroundType + ", blocked=" + blocked + ", enemy=" + enemy + ", riddle=" + riddle + ", itemRequired=" + itemRequired + ", obtainItem=" + obtainItem + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}


