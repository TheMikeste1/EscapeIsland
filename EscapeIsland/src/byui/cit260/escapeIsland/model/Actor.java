/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeIsland.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Austin
 */
public enum Actor implements Serializable {
    
 MonsterZombie("Zombie" , new Point(1,1),"A frightful zombie", 2, 2, 2 ),
 PrisonGaurd("Erik" , new Point(2,2), "A tired prison guard", 2, 2, 2 );
 

private String actorName;
private Point actorcoordinates;
private String actorDescription;
private long actorAttack;
private long actorDefense;
private long actorSpeed;
private ArrayList <Item> actorItems = new ArrayList();

    private Actor() {
    }


    private Actor(String actorName, Point actorcoordinates, String actorDescription, long actorAttack, long actorDefense, long actorSpeed) {
        this.actorName = actorName; 
        this.actorcoordinates = actorcoordinates;
        this.actorDescription = actorDescription;
        this.actorAttack = actorAttack;
        this.actorDefense = actorDefense;
        this.actorSpeed = actorSpeed;
 }

    public String getActorName() {
        return actorName;
    }

    public Point getActorcoordinates() {
        return actorcoordinates;
    }

    public String getActorDescription() {
        return actorDescription;
    }

    public long getActorAttack() {
        return actorAttack;
    }

    public long getActorDefense() {
        return actorDefense;
    }

    public long getActorSpeed() {
        return actorSpeed;
    }

    public ArrayList<Item> getActorItems() {
        return actorItems;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorName=" + actorName + ", actorcoordinates=" + actorcoordinates + ", actorDescription=" + actorDescription + ", actorAttack=" + actorAttack + ", actorDefense=" + actorDefense + ", actorSpeed=" + actorSpeed + ", actorItems=" + actorItems + '}';
    }


}
