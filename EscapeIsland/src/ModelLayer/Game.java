/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author collin
 */
public class Game implements Serializable {

    public Game() {
    }
    
    private Item[] item;
    private Player[] player;
    private Map map;
    private Actor actor;

    public Game(Item[] item, Player[] player, Map map, Actor actor) {
        this.item = item;
        this.player = player;
        this.map = map;
        this.actor = actor;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Arrays.deepHashCode(this.item);
        hash = 61 * hash + Arrays.deepHashCode(this.player);
        hash = 61 * hash + Objects.hashCode(this.map);
        hash = 61 * hash + Objects.hashCode(this.actor);
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
        final Game other = (Game) obj;
        if (!Arrays.deepEquals(this.item, other.item)) {
            return false;
        }
        if (!Arrays.deepEquals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (this.actor != other.actor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "item=" + item + ", player=" + player + ", map=" + map + ", actor=" + actor + '}';
    }

}