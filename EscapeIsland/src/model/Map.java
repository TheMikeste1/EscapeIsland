/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author collin
 */
public class Map implements Serializable{
    
    private String mapDescription;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    private Location[][] locations;

    public Map() {
    }

    public Map(String mapDescription, int rowCount, int columnCount, int currentRow, int currentColumn, Location[][] locations) {
        this.mapDescription = mapDescription;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
        this.locations = locations;
    }
    
    public String getMapDescription() {
        return mapDescription;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setMapDescription(String mapDescription) {
        this.mapDescription = mapDescription;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.mapDescription);
        hash = 23 * hash + this.rowCount;
        hash = 23 * hash + this.columnCount;
        hash = 23 * hash + this.currentRow;
        hash = 23 * hash + this.currentColumn;
        hash = 23 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Objects.equals(this.mapDescription, other.mapDescription)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "mapDescription=" + mapDescription + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", locations=" + locations + '}';
    }

    public Map(String mapDescription, int rowCount, int columnCount, int currentRow, int currentColumn) {
        this.mapDescription = mapDescription;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
    }

    
    
}
   
