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
        player.setActor(Actor.Hero);
        Riddle[] riddles = createRiddles();
        Map cheeseburger = createMap(adidas.getCurGame(), 10,10);
        if (cheeseburger == null){
            return -2;
        }
        
        game.setMap(cheeseburger);
        game.getMap().setLocations(createLocations(10,10));
        assignActorsToLocations(game.getMap().getLocations());
        
        
        assignItemsToLocations(game.getMap().getLocations());
        
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
        game.getMap().setRowCount(numOfRows);
        game.getMap().setColumnCount(numOfColumns);
        game.setMap(map);
        
        
        
        return map;
        
        
        }
    

        
    public static Location[][] createLocations(int rows, int columns){
        System.out.println("*** createLocations called ***");

        Location[][] bob = new Location[rows][columns];
        
        
        for (int k=0; k<bob.length;k++) {
            for (int j=0; j<bob[0].length;j++) {
                bob[k][j] = new Location();
            }
        }
        
        
        if( rows < 0 || columns < 0){
        return null;
        }
        
        bob[0][0].setBackgroundType(BackgroundType.Ocean);
        bob[0][0].setColumn(0);
        bob[0][0].setRow(0);
        bob[0][0].setBlocked(Boolean.TRUE);
        // top row
        bob[0][1].setBackgroundType(bob[0][0].getBackgroundType());
        bob[0][2].setBackgroundType(bob[0][0].getBackgroundType());
        bob[0][3].setBackgroundType(bob[0][0].getBackgroundType());
        bob[0][4].setBackgroundType(bob[0][0].getBackgroundType());
        bob[0][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[0][6].setBackgroundType(bob[0][0].getBackgroundType());
        bob[1][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[2][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[3][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[4][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[5][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[6][6].setBackgroundType(bob[0][0].getBackgroundType());
        bob[0][7].setBackgroundType(bob[0][0].getBackgroundType());
        bob[0][8].setBackgroundType(bob[0][0].getBackgroundType());
        bob[0][9].setBackgroundType(bob[0][0].getBackgroundType());
        //left column
        bob[1][0].setBackgroundType(bob[0][0].getBackgroundType());
        bob[2][0].setBackgroundType(bob[0][0].getBackgroundType());
        bob[3][0].setBackgroundType(bob[0][0].getBackgroundType());
        bob[4][0].setBackgroundType(bob[0][0].getBackgroundType());
        bob[5][0].setBackgroundType(bob[0][0].getBackgroundType());
        bob[6][0].setBackgroundType(bob[0][0].getBackgroundType());
        bob[6][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[8][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[7][0].setBackgroundType(bob[0][0].getBackgroundType());
        bob[8][0].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][0].setBackgroundType(bob[0][0].getBackgroundType());
        // bottom row
        bob[9][1].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][2].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][3].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][4].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][5].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][6].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][7].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][8].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][9].setBackgroundType(bob[0][0].getBackgroundType());
        //right column
        
        bob[1][9].setBackgroundType(bob[0][0].getBackgroundType());
        bob[2][9].setBackgroundType(bob[0][0].getBackgroundType());
        bob[3][9].setBackgroundType(bob[0][0].getBackgroundType());
        bob[4][9].setBackgroundType(bob[0][0].getBackgroundType());
        bob[5][9].setBackgroundType(bob[0][0].getBackgroundType());
        bob[6][9].setBackgroundType(bob[0][0].getBackgroundType());
        bob[7][9].setBackgroundType(bob[0][0].getBackgroundType());
        bob[8][9].setBackgroundType(bob[0][0].getBackgroundType());
        bob[9][9].setBackgroundType(bob[0][0].getBackgroundType());
        
        
          for(int i = 0; i < bob.length; i++){
            for(int k = 0; k < bob[0].length;){
                bob[i][k].setBlocked(true);
            }
        }
          
          for(Location[] la: bob) {
              for(Location l : bob[0]){
                  if(l.getBackgroundType() == BackgroundType.Ocean){
                      l.setBlocked(Boolean.TRUE);
                  }
              }
          }
          
          for(Location[] la: bob) {
              for(Location l : bob[0]){
                  if(l.getBackgroundType() == BackgroundType.Ocean){
                      l.setVisited(Boolean.FALSE);
                  }
              }
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
        
    private static int assignItemsToLocations(Location[][] locations){
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
