/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Austin
 */
public enum BackgroundType implements Serializable {
    
    Beach("Shore", "B", false),
    Forest("Forest", "F", false),
    Mountain ("Mountain", "M", false),
    Wall ("Wall","W",false),
    Prison ("Prison","P",false),
    Bridge ("Bridge","=",true),
    Ocean("Ocean", "~", false);
    
        
    private final String name;
    private final String printValue;
    private final Boolean special;

  
    
    
    
    private BackgroundType(String name, String printValue, boolean special) {
        this.name = name;
        this.printValue = printValue;
        this.special = true;
        
    
    }

    public String getName() {
        return name;
    }

    public String getPrintValue() {
        return printValue;
    }

    public Boolean getSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return "BackgroundType{" + "name=" + name + ", printValue=" + printValue + ", special=" + special + '}';
    }
 
    
}
