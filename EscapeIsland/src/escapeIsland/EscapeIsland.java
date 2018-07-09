package escapeIsland;

import model.*;
import control.*;
import static control.GameControl.createRiddles;
import view.StartProgramView;
import view.GameMenuView;

/**
 *
 * @author collin
 */
public class EscapeIsland {

    private static Game currentGame = null;
    private static Player currentPlayer;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        EscapeIsland.currentGame = currentGame;
    }

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player currentPlayer) {
        EscapeIsland.currentPlayer = currentPlayer;
    }

    public static void main(String[] args) {
        EscapeIsland adidas = new EscapeIsland();
        GameControl gameControl = new GameControl();
        
//Riddle[] riddle = createRiddles();

//        Location[][] location = gameControl.createLocations(6, 6, riddle);

//        if (location[0][0] != null) {
//            System.out.println(-1);
//        }
//
//        System.out.println(location[0][0].getBackgroundType());

// System.out.println(derp[0][1].getBackgroundType());
//        for(Location[] la: derp) {
//              for(Location l : derp[0]){
//                  if (l.getBackgroundType() != null){
//                    System.out.println(l.getBackgroundType());
//                }
//              }
//          }




        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        

//        GameMenuView gameMenuView = new GameMenuView();
//        gameMenuView.displayGameMenuView(player, map);
//        gameMenuView.openMap(map);
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
