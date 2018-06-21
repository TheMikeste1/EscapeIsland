package escapeIsland;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.Actor;
import model.Game;
import model.Player;
import model.BackgroundType;
import model.Item;
import model.Map;
import model.PuzzleLocation;
import model.Riddle;
import model.Location;
import control.CombatControl;
import view.StartProgramView;
import view.GameMenuView;

/**
 *
 * @author collin
 */
public class EscapeIsland {

    /**
     * @param args the command line arguments
     */
    
    private static Game game = null;
    private static Player player = null;

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        EscapeIsland.game = game;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        EscapeIsland.player = player;
    }
    
    public static void main(String[] args) {
  
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        Player player = new Player();
        Map map = new Map();
        
        //GameMenuView gameMenuView = new GameMenuView();
        //gameMenuView.displayGameMenuView(player, map);
        //gameMenuView.openMap(map);
        
        
   
//        // TODO code application logic here
//        Player austin = new Player();
//            austin.setPlayerName("austin");
//        
//        
//        Game game = new Game();
//        Player[] list = new Player[1];
//        list[0] = austin;
//            game.setPlayer(list);
//        System.out.println(game.toString());
//        
//        System.out.println(Actor.PrisonGaurd.toString());
//        
//        System.out.println(Item.ToolKit.toString());
//        
//        System.out.println(BackgroundType.Beach.toString());
//        
//        
//        Map map1 = new Map("test map",1,1,1,1);
//        System.out.println(map1.toString());
//        
//        Location location1 = new Location(1,1,true,true,"1",BackgroundType.Beach,true);
//        
//        System.out.println(location1.toString());
//        
//        PuzzleLocation room = new PuzzleLocation("interaction",1,1,true,true,"1",BackgroundType.Beach,true);
//        
//        System.out.println(room.toString());
//        
//        Riddle question1 = new Riddle("favorite color","blue");
//        
//        System.out.println(question1.toString());
        
    }
    
}
