/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeisland;

import ModelLayer.Actor;
import ModelLayer.Game;
import ModelLayer.Player;

/**
 *
 * @author collin
 */
public class EscapeIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player austin = new Player();
            austin.setPlayerName("austin");
        
        
        Game game = new Game();
        Player[] list = new Player[1];
        list[0] = austin;
            game.setPlayer(list);
        
        System.out.println(game.toString());
        
        System.out.println(Actor.PrisonGaurd.toString());

        
        
        
    }
    
}
