
package model;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {

    private String playersName;

    private Actor actor;

    // Constructors
    public Player() {
    }

    public String getPlayersName() {
        return playersName;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }
    
    // Getters
    public Actor getActor() {
        return actor;
    }

   
    //Setters
    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
