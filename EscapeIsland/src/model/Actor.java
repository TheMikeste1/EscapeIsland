/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Austin
 */
public enum Actor implements Serializable {
    
    // rework monster idea/stats to devolop gameplay
 MonsterZombie("Zombie" , new Point(1,1),"a frightful zombie", 3, 2, 2 ),
 MonsterSkeleton("Skeleton" , new Point(1,1),"a terrifying skeleton", 2, 3, 2 ),
 MonsterGoblin("Goblin" , new Point(1,1),"a spooky goblin", 2, 2, 3 ),
 PrisonGuard("Erik" , new Point(2,2), "a tired prison guard", 2, 2, 1 ),
 Inmate02("Inmate02" , new Point(2,2), "an enraged prison inmate", 3, 3, 1 ),
 Inmate09("Inmate09" , new Point(2,2), "an enraged prison inmate", 2, 3, 1 ),
 Inmate08("Inmate08" , new Point(2,2), "an enraged prison inmate", 4, 1, 1 ),
 OldMan("Thomas" , new Point(1,1),"a lonesome old man trapped on the island", 0, 0, 0 ),
 Hero("Hero" , new Point(3,4), "The hero", 1, 1, 1);

private String actorName;
private Point actorcoordinates;
private String actorDescription;
private long actorAttack;
private long actorDefense;
private long actorSpeed;
private ArrayList <Item> actorItems = new ArrayList();
private Item currentItem;

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

    public void setActorItems(ArrayList<Item> actorItems) {
        this.actorItems = actorItems;
    }

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item currentItem) {
        this.currentItem = currentItem;
    }


    
    
}
