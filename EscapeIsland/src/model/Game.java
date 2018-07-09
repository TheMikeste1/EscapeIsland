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
    private MapControl mapControl;
    private GameControl gameControl;

    public Game() {

    }

    public GameControl getGameControl() {
        return gameControl;
    }

    public void setGameControl(GameControl gameControl) {
        this.gameControl = gameControl;
    }

    public MapControl getMapControl() {
        return mapControl;
    }

    public void setMapControl(MapControl mapControl) {
        this.mapControl = mapControl;
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

        return true;
    }

}
