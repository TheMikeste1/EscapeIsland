/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Game;
import model.Player;

/**
 *
 * @author Austin
 */
public class GameControl {

    public static Player savePlayer(String playersName) {
        // System.out.println("*** SavePlayer() called ***");
        return new Player();
    }
    
    public static int createNewGame(Player[] player) {
        
        if(player == null){
            System.out.println("Indicates invalid input");
            return -1;
        }
       
        Game game = new Game();
            
            game.setPlayer(player);


//call setter to save Player object in the game object
//call setter to save the game in the main class of program
//call setter to assign an actor to the player
//// Create the lists of used in the game
//items = createItems()
//call setter to save items list in the game object
//// Create all other list (e.g., questions, weapons, spells) and save in the game
//…
//map = createMap(game, noOfRows, noOfColumns)
//if map == null
// return -2 // indicates create map failed
//endif
//call setter to save the map in the game object 
        
        return 1;
    }
    
}
