/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

import java.io.Serializable;

/**
 *
 * @author Austin
 */
public enum BackgroundType implements Serializable {
    
    Beach("Shore", "B", "0"),
    Forest("Forest", "F", "0"),
    Mountain ("Mountain", "M", "0"),
    Wall ("Wall","W","0"),
    Prison ("Prison","P","0");
    
        
    private final String name;
    private final String printValue;
    private final String special;

  
    
    
    
    private BackgroundType(String name, String printValue, String special) {
        this.name = name;
        this.printValue = printValue;
        this.special = special;
        
    
    }

    public String getName() {
        return name;
    }

    public String getPrintValue() {
        return printValue;
    }

    public String getSpecial() {
        return special;
    }

    @Override
    public String toString() {
        return "BackgroundType{" + "name=" + name + ", printValue=" + printValue + ", special=" + special + '}';
    }
 
    
}
