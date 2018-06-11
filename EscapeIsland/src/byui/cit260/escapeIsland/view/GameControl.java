/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeIsland.view;

import ModelLayer.Player;

/**
 *
 * @author Austi
 */
public class GameControl {

    public static Player savePlayer(String playersName) {
        System.out.println("*** SavePlayer() called ***");
        return new Player();
    }
    
}
