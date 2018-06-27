/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import escapeIsland.*;
import model.*;

/**
 *
 * @author Austin
 */
public class GameControl {

    public static Player savePlayer(String playersName) {
        // System.out.println("*** SavePlayer() called ***");
        return new Player();
    }
    
    public static int createNewGame (Player player) {
        System.out.println("*** createNewGame called");
        if (player == null) {
            return -1;
        }
        
        Game game = new Game();
        game.setPlayer(player);
        EscapeIsland adidas = new EscapeIsland();
        adidas.setGame(game);
        player.setActor(Actor.PrisonGuard);
        Riddle[] riddles = createRiddles();
        Map cheeseburger = createMap(adidas.getCurGame(), 5,10);
        if (cheeseburger == null){
            return -2;
        }
        game.setMap(cheeseburger);
        return 1;
        
    }
    
    public static Riddle[] createRiddles() {
    
        Riddle[] riddles = new Riddle[5];
        
        for(int i=0;i<riddles.length;i++){
        riddles[i] = new Riddle();
        
        }
        riddles[0].setRiddle("What is the airspeed velocity of a north african swallow");
        riddles[0].setAnswer("");
        
        riddles[1].setRiddle("What always ends everything?");
        riddles[1].setAnswer("g");
        
        riddles[2].setRiddle("What has four fingers and a thumb, but is not living");
        riddles[2].setAnswer("A glove");
        
        riddles[3].setRiddle("I have keys but no lock. I have a space but no room. You can enter, but can't go outside. What am I?");
        riddles[3].setAnswer("A keyboard");
        
        riddles[4].setRiddle("What gets bigger the more you take away.");
        riddles[4].setAnswer("A hole");
        
        return riddles;
    }

    private static Map createMap(Game game, int numOfRows, int numOfColumns) {
    
    return new Map();
    }
    
}
