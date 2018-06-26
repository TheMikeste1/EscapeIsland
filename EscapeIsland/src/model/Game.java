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
public class Game implements Serializable {
    
    public Player player;
    private Map map;
    private Riddle[] riddle;
    
      public Game() {
          
    }

    public Riddle[] getRiddle() {
        return riddle;
    }

    public void setRiddle(Riddle[] riddle) {
        this.riddle = riddle;
    }



    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.map);
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

        if (!Objects.equals(this.map, other.map)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Game{" + ", player=" + player + ", map=" + map + '}';
    }

}