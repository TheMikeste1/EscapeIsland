/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author collin
 */
public class Map implements Serializable{
    
    private String mapDescription;
    private Point rowCount;
    private Point columnCount;
    private Point currentRow;
    private Point currentColumn;

    public Map(String mapDescription, Point rowCount, Point columnCount, Point currentRow, Point currentColumn) {
        this.mapDescription = mapDescription;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
    }

    public String getMapDescription() {
        return mapDescription;
    }

    public void setMapDescription(String mapDescription) {
        this.mapDescription = mapDescription;
    }

    public Point getRowCount() {
        return rowCount;
    }

    public void setRowCount(Point rowCount) {
        this.rowCount = rowCount;
    }

    public Point getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Point columnCount) {
        this.columnCount = columnCount;
    }

    public Point getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(Point currentRow) {
        this.currentRow = currentRow;
    }

    public Point getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(Point currentColumn) {
        this.currentColumn = currentColumn;
    }

    @Override
    public String toString() {
        return "Map{" + "mapDescription=" + mapDescription + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.mapDescription);
        hash = 79 * hash + Objects.hashCode(this.rowCount);
        hash = 79 * hash + Objects.hashCode(this.columnCount);
        hash = 79 * hash + Objects.hashCode(this.currentRow);
        hash = 79 * hash + Objects.hashCode(this.currentColumn);
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
        if (!Objects.equals(this.mapDescription, other.mapDescription)) {
            return false;
        }
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        if (!Objects.equals(this.currentRow, other.currentRow)) {
            return false;
        }
        if (!Objects.equals(this.currentColumn, other.currentColumn)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
