
package model;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {
      private int positionX;
      private int positionY;
        
    private String playerName;

        // Constructors
        public Player() {
        }

        public Player(String playerName, int positionX, int positionY) {
            this.playerName = playerName;
            this.positionX = positionX;
            this.positionY = positionY;
        }
      
        // Getters
        public String getPlayerName() {
            return playerName;
        }

        public int getPositionX() {
            return positionX;
        }

        public int getPositionY() {
            return positionY;
        }
        
        //Setters
        public void setPlayerName(String playerName) {
        this.playerName = playerName;
        }
        
        public void setPositionX(int positionX) {
            this.positionX = positionX;
        }

        public void setPositionY(int positionY) {
            this.positionY = positionY;
        }    
}
