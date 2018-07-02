/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import escapeIsland.*;
import java.util.Set;
import model.*;
import control.MapControl;
import static control.MapControl.createLocations;
/**
 *
 * @author Austin
 */
public class GameControl {

    public static Player savePlayer(String playersName) {
        // System.out.println("*** SavePlayer() called ***");
        return new Player();
    }

    public static int createNewGame(Player player, EscapeIsland mainGame) {
        System.out.println("*** createNewGame called ***");
        if (player == null) {
            return -1;
        }
        //Create new Game
        Game game = new Game();
        game.setPlayer(player);
        //Add the create game ot the game we're playing (EscapeIsland)
        EscapeIsland adidas = new EscapeIsland();
        adidas.setCurrentGame(game);
        
        player.setActor(Actor.Hero);
        
        Riddle[] riddle = createRiddles();
        Map map = MapControl.createMap(adidas.getCurrentGame(), 6, 6);
        if (map == null) {
            return -2;
        }

        game.getMapControl().setMap(map);
        game.getMapControl().getMap().setLocations(createLocations(6, 6, riddle));
        new MapControl().assignActorsToLocations(new Map().getLocations());
        new MapControl().assignItemsToLocations(game.getMapControl().getMap().getLocations());

        mainGame = adidas;
        
        return 1;

    }

    public static Riddle[] createRiddles() {
        System.out.println("*** createRiddles called ***");

        Riddle[] riddles = new Riddle[5];

        for (int i = 0; i < riddles.length; i++) {
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
    
}
