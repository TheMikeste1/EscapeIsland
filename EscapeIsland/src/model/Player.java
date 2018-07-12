
package model;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {

    private String playersName;

    private Actor actor;

    public Player() {
        actor = actor.Hero;
    }

    public String getPlayersName() {
        return playersName;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }
    
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
