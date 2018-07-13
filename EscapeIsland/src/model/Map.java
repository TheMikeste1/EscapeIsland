
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Map implements Serializable{
    
    private String mapDescription;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    public Location[][] locations;
    public char[][]physicalMapView;
    public char[][]interactionMapView;

    
    //Constructors
    public Map() {
            //Legend
            //M == Mountain
            //F == Forest
            //B == Beach
            //C == Camp
            //P == Prision
            //= == Bridge
                       
            //rework map to promote story/gameplay (with actor enum)
            this.physicalMapView = new char[][]{
                     // 0   1   2   3   4   5   6   7   8   9
                /*0*/ {'~','~','~','~','~','~','~','~','~','~'}
                /*1*/,{'~','B','B','B','B','~','M','M','M','~'}
                /*2*/,{'~','B','M','M','F','~','M','P','M','~'}
                /*3*/,{'~','B','M','M','F','~','M','M','M','~'}
                /*4*/,{'~','B','M','M','F','~','M','M','M','~'}
                /*5*/,{'~','F','F','F','F','~','~','=','~','~'}
                /*6*/,{'~','B','F','F','F','F','F','F','B','~'}
                /*7*/,{'~','B','C','F','B','B','B','B','B','~'}
                /*8*/,{'~','B','B','B','B','B','B','B','B','~'}
                /*9*/,{'~','~','~','~','~','~','~','~','~','~'}};
             
            //Legend
            //! = Interaction
            //X = Nothing
            
            this.interactionMapView = new char[][]{
                 {'X','X','X','X','X','X','X','X','X','X'}
                ,{'X','X','X','X','X','X','X','X','!','X'}
                ,{'X','X','!','X','X','X','!','!','X','X'}
                ,{'X','X','X','X','X','X','!','!','X','X'}
                ,{'X','X','!','!','X','X','!','!','X','X'}
                ,{'X','X','X','X','!','X','!','!','X','X'}
                ,{'X','X','!','!','X','X','X','X','!','X'}
                ,{'X','X','!','!','X','!','X','X','X','X'}
                ,{'X','X','X','X','X','X','X','!','X','X'}
                ,{'X','X','X','X','X','X','X','X','X','X'}}; 
    }

    public Map(String mapDescription, int rowCount, int columnCount, int currentRow, int currentColumn, Location[][] locations) {
        this.mapDescription = mapDescription;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
        this.locations = locations;

        
            //Legend
            //M == Mountain
            //F == Forest
            //B == Beach
            //C == Camp
            //P == Prision
            //= == Bridge
                       
             this.physicalMapView = new char[][]{
                     // 0   1   2   3   4   5   6   7   8   9
                /*0*/ {'~','~','~','~','~','~','~','~','~','~'}
                /*1*/,{'~','B','B','B','B','~','M','M','M','~'}
                /*2*/,{'~','B','M','M','F','~','M','P','M','~'}
                /*3*/,{'~','B','M','M','F','~','M','M','M','~'}
                /*4*/,{'~','B','M','M','F','~','M','M','M','~'}
                /*5*/,{'~','F','F','F','F','~','~','=','~','~'}
                /*6*/,{'~','B','F','F','F','F','F','F','B','~'}
                /*7*/,{'~','B','C','F','B','B','B','B','B','~'}
                /*8*/,{'~','B','B','B','B','B','B','B','B','~'}
                /*9*/,{'~','~','~','~','~','~','~','~','~','~'}};
           
             
            //Legend
            //! = Interaction
            //X = Nothing
            
//            this.interactionMapView = new char[][]{
//                 {'X','X','X','X','X','X','X','X','X','X'}
//                ,{'X','X','X','X','X','X','X','X','!','X'}
//                ,{'X','X','!','X','X','X','!','!','X','X'}
//                ,{'X','X','X','X','X','X','!','!','X','X'}
//                ,{'X','X','!','!','X','X','!','!','X','X'}
//                ,{'X','X','X','X','!','X','!','!','X','X'}
//                ,{'X','X','!','!','X','X','X','X','!','X'}
//                ,{'X','X','!','!','X','!','X','X','X','X'}
//                ,{'X','X','X','X','X','X','X','!','X','X'}
//                ,{'X','X','X','X','X','X','X','X','X','X'}}; 
//    }
    }
    //Getters
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

    public char[][] getPhysicalMapView() {
        return physicalMapView;
    }

    public char[][] getInteractionMapView() {
        return interactionMapView;
    }


    
    
    //Setters
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
    
    public void setPhysicalMapView(char[][] physicalMapView) {
        this.physicalMapView = physicalMapView;
    }
    
     public void setInteractionMapView(char[][] interactionMapView) {
        this.interactionMapView = interactionMapView;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.mapDescription);
        hash = 79 * hash + this.rowCount;
        hash = 79 * hash + this.columnCount;
        hash = 79 * hash + this.currentRow;
        hash = 79 * hash + this.currentColumn;
        hash = 79 * hash + Arrays.deepHashCode(this.locations);
        hash = 79 * hash + Arrays.deepHashCode(this.physicalMapView);
        hash = 79 * hash + Arrays.deepHashCode(this.interactionMapView);
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
        if (!Arrays.deepEquals(this.physicalMapView, other.physicalMapView)) {
            return false;
        }
        if (!Arrays.deepEquals(this.interactionMapView, other.interactionMapView)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "mapDescription=" + mapDescription + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", locations=" + locations + ", physicalMapView=" + physicalMapView + ", interactionMapView=" + interactionMapView + '}';
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
   
