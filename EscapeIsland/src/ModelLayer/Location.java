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
 * @author Austin
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private Boolean visited; 
    private Boolean complete;
    private String description;
    private BackgroundType backgroundType;
    private Boolean blocked;
    private String locationType;
    private String item; 

    public Location(int row, int column, Boolean visited, Boolean complete, String description, BackgroundType backgroundType, Boolean blocked, String locationType, String item) {
        this.row = row;
        this.column = column;
        this.visited = visited;
        this.complete = complete;
        this.description = description;
        this.backgroundType = backgroundType;
        this.blocked = blocked;
        this.locationType = locationType;
        this.item = item;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Boolean getVisited() {
        return visited;
    }

    public Boolean getComplete() {
        return complete;
    }

    public String getDescription() {
        return description;
    }

    public BackgroundType getBackgroundType() {
        return backgroundType;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public String getLocationType() {
        return locationType;
    }

    public String getItem() {
        return item;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBackgroundType(BackgroundType backgroundType) {
        this.backgroundType = backgroundType;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.row;
        hash = 67 * hash + this.column;
        hash = 67 * hash + Objects.hashCode(this.visited);
        hash = 67 * hash + Objects.hashCode(this.complete);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.backgroundType);
        hash = 67 * hash + Objects.hashCode(this.blocked);
        hash = 67 * hash + Objects.hashCode(this.locationType);
        hash = 67 * hash + Objects.hashCode(this.item);
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
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.locationType, other.locationType)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.complete, other.complete)) {
            return false;
        }
        if (this.backgroundType != other.backgroundType) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", complete=" + complete + ", description=" + description + ", backgroundType=" + backgroundType + ", blocked=" + blocked + ", locationType=" + locationType + ", item=" + item + '}';
    }
    
    
    
   
    
}
