/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import escapeIsland.*;
import java.util.Set;
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
        Location[][] hank = createLocations(5,5);
        assignActorsToLocations(hank);
        
        
        assignItemsToLocations(hank, Item.Bat);
        
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
        
        if( game == null || numOfRows < 0 || numOfColumns < 0 ){
            return null;
        }
        
        Map map = new Map();
        
        //adidas.setGame(game);
        game.getMap().setMapDescription("This is the map.");
        game.getMap().setRowCount(5);
        game.getMap().setColumnCount(5);
        game.setMap(map);
        
        
        
        return map;
        
        
        }
    

        
    public static Location[][] createLocations(int rows, int columns){
        System.out.println("*** createLocations called ***");

        Location[][] bob = new Location[5][5];
        
        if( rows < 0 || columns < 0){
        return null;
        }
        
        // change to locations[][] when made
        return bob;
    }
    
    private static int assignActorsToLocations(Location[][] hank){
        System.out.println(" *** assignActorsToLocations called ***");
        
        if( hank == null){
            return -1;
        }
        return 1;
    } 
        
    private static int assignItemsToLocations(Location[][] locations, enum Item){
        System.out.println(" *** assignItemToLocations called ***");
        
        if( locations == null){
            return -1;
        }
        return 1;
    }
    
    

    


        
        
      
//// create a two-dimensional array of locations and assign array to the map
//locations = createLocations(noOfRows, noOfColumns)
//if (locations is null) then
// return null
//endif
//call setter to save a locations array in the map object
//// assign actors and items to locations
//success = assignActorsToLocations(locations)
//if (success < 0) then
// return null
//endif
//success = assignIemsToLocations(locations)
//if (success < 0) then
// return null
//endif
// Assign all other types objects to locations (e.g., questions, spells) 
 //   return new Map();
    }
}
