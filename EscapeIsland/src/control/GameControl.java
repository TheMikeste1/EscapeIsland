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
        
        
        
        
        return riddles;
    }

    private static Map createMap(Game game, int numOfRows, int numOfColumns) {
    
    return new Map();
    }
    
}
