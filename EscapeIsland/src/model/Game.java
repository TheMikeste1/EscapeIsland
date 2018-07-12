/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.GameControl;
import control.MapControl;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author collin
 */
public class Game implements Serializable {

    public Player player;
    private Riddle[] riddle;
    private Map map;

    public Game() {


}

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;  

    }

    public Riddle[] getRiddle() {
        return riddle;
    }

    public void setRiddle(Riddle[] riddle) {
        this.riddle = riddle;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
        System.out.println(this.map.getLocations());
         //       [this.player.getActor().getActorcoordinates().x]
           //     [this.player.getActor().getActorcoordinates().y]
             //   .setVisited(true);
    }

    
    
}
