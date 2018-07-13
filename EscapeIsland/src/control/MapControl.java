package control;

import escapeIsland.EscapeIsland;
import exceptions.MapControlException;
import java.awt.Point;
import model.*;

/**
 *
 * @author Austin
 */
public class MapControl {

    private static Map map;

    public MapControl() {
    }

    public static Map createMap(Game game, int numOfRows, int numOfColumns)
            throws MapControlException {
        System.out.println("*** createMap called ***");

        // check for invalid inputs
        if (game == null || numOfRows < 0 || numOfColumns < 0) {
            throw new MapControlException("actor is null");
        }

        // create the map object and assign values to it
        Map map = new Map();
        game.setMap(map);
        game.getMap().setMapDescription("This is the map.");
        game.getMap().setRowCount(numOfRows);
        game.getMap().setColumnCount(numOfColumns);

        return map;
    }
    // create a two-dimensional array of locations and assign array to the map

    public static Location[][] createLocations(int rows, int columns, Riddle[] riddle)
            throws MapControlException {
        System.out.println("*** createLocations called ***");

        Location[][] locations = new Location[rows][columns];

        if (rows < 0 || columns < 0) {
            throw new MapControlException("locations is null");
        }

        // Line 0
        Location location = new Location();
        locations[0][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[1][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(1);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[2][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(2);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[3][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(3);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[4][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(4);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[5][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(5);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[6][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(6);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[7][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(7);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[8][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(8);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[9][0] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        
        
        // Line 1
        location = new Location();
        locations[0][1] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(0);
        location.setRow(1);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[1][1] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(1);
        location.setRow(1);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(Actor.MonsterZombie);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.KiteShield);
        location.setTalkToNPC(null);

        location = new Location();
        locations[2][1] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(1);
        location.setRow(2);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(Actor.MonsterSkeleton);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.Bat);
        location.setTalkToNPC(null);

        location = new Location();
        locations[3][1] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(1);
        location.setRow(3);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.Buckler);
        location.setTalkToNPC(null);

        location = new Location();
        locations[4][1] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(1);
        location.setRow(4);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.Stick);
        location.setTalkToNPC(Actor.OldMan);

        location = new Location();
        locations[5][1] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(1);
        location.setRow(5);
        location.setBlocked(false);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[6][1] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(1);
        location.setRow(6);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[7][1] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(1);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[8][1] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(1);
        location.setRow(8);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[9][1] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(1);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);


        // Line 2
        location = new Location();
        locations[0][2] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(2);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[1][2] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(2);
        location.setRow(1);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(Actor.MonsterZombie);
        location.setRiddle(riddle[1]);
        location.setItemRequired(Item.Lantern);
        location.setObtainItem(Item.Sword);
        location.setTalkToNPC(null);

        location = new Location();
        locations[2][2] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(2);
        location.setRow(2);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(Actor.Inmate02);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.Lantern);
        location.setTalkToNPC(null);

        location = new Location();
        locations[3][2] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(2);
        location.setRow(3);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(riddle[2]);
        location.setItemRequired(null);
        location.setObtainItem(Item.CrockpotLid);
        location.setTalkToNPC(null);

        location = new Location();
        locations[4][2] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(2);
        location.setRow(4);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.Compass);
        location.setTalkToNPC(null);

        location = new Location();
        locations[5][2] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(2);
        location.setRow(5);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[6][2] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(2);
        location.setRow(6);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[7][2] = location;
        location.setBackgroundType(BackgroundType.Camp);
        location.setColumn(2);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Camp");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[7][2] = location;
        location.setBackgroundType(BackgroundType.Camp);
        location.setColumn(2);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Camp");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[8][2] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(2);
        location.setRow(0);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[9][2] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(2);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        // Line 3

        
        location = new Location();
        locations[0][3] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(3);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[1][3] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(3);
        location.setRow(1);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(Actor.MonsterSkeleton);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.Buckler);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[2][3] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(3);
        location.setRow(2);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(Actor.MonsterSkeleton);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.Buckler);
        location.setTalkToNPC(null);
        location = new Location();
        
        locations[3][3] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(3);
        location.setRow(3);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(Actor.MonsterSkeleton);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.Buckler);
        location.setTalkToNPC(null);

        location = new Location();
        locations[4][3] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(3);
        location.setRow(4);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.HamRadioManual);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[5][3] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(3);
        location.setRow(5);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.HamRadioManual);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[6][3] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(3);
        location.setRow(6);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.HamRadioManual);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[7][3] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(3);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.HamRadioManual);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[8][3] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(3);
        location.setRow(8);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.HamRadioManual);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[9][3] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(3);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        // Line 4
        
        location = new Location();
        locations[0][4] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(4);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[1][4] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(4);
        location.setRow(1);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(Actor.PrisonGuard);
        location.setRiddle(riddle[3]);
        location.setItemRequired(null);
        location.setObtainItem(Item.HamRadioManual);
        location.setTalkToNPC(Actor.PrisonGuard);

        location = new Location();
        locations[2][4] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(4);
        location.setRow(2);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[3][4] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(4);
        location.setRow(3);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.solderingIron);
        location.setTalkToNPC(null);

        location = new Location();
        locations[4][4] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(4);
        location.setRow(4);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(Actor.MonsterGoblin);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(Item.ToolKit);
        location.setTalkToNPC(null);

        location = new Location();
        locations[5][4] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(4);
        location.setRow(5);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[6][4] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(4);
        location.setRow(6);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[7][4] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(4);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[8][4] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(4);
        location.setRow(8);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[9][4] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(4);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        // Line 5
        location = new Location();
        locations[0][5] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(5);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[1][5] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(5);
        location.setRow(1);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[2][5] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(5);
        location.setRow(2);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[3][5] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(5);
        location.setRow(3);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[4][5] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(5);
        location.setRow(4);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[5][5] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(5);
        location.setRow(5);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[6][5] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(5);
        location.setRow(6);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[7][5] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(5);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
       
        location = new Location();
        locations[8][5] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(5);
        location.setRow(8);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[9][5] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(5);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        // Line 6
        
        location = new Location();
        locations[0][6] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(6);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[1][6] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(6);
        location.setRow(1);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[2][6] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(6);
        location.setRow(2);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[3][6] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(6);
        location.setRow(3);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[4][6] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(6);
        location.setRow(4);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[5][6] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(6);
        location.setRow(5);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[6][6] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(6);
        location.setRow(6);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[7][6] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(6);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[8][6] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(6);
        location.setRow(8);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[9][6] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(6);
        location.setRow(8);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        // Line 7
        
        locations[0][7] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(7);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[1][7] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(7);
        location.setRow(1);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[2][7] = location;
        location.setBackgroundType(BackgroundType.Prison);
        location.setColumn(7);
        location.setRow(2);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Prison");
        location.setActor(Actor.PrisonGuard);
        location.setRiddle(riddle[3]);
        location.setItemRequired(null);
        location.setObtainItem(Item.HamRadioManual);
        location.setTalkToNPC(Actor.PrisonGuard);
        
        locations[3][7] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(7);
        location.setRow(3);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[4][7] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(7);
        location.setRow(4);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[5][7] = location;
        location.setBackgroundType(BackgroundType.Bridge);
        location.setColumn(7);
        location.setRow(5);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Bridge");
        location.setActor(Actor.PrisonGuard);
        location.setRiddle(riddle[4]);
        location.setItemRequired(Item.Key);
        location.setObtainItem(Item.Key);
        location.setTalkToNPC(null);
        
        locations[6][7] = location;
        location.setBackgroundType(BackgroundType.Forest);
        location.setColumn(7);
        location.setRow(6);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Forest");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[7][7] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(7);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[8][7] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(7);
        location.setRow(8);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[9][7] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(7);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        // Line 8
        
        location = new Location();
        locations[0][8] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(8);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[1][8] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(8);
        location.setRow(1);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[2][8] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(8);
        location.setRow(2);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[3][8] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(8);
        location.setRow(3);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[4][8] = location;
        location.setBackgroundType(BackgroundType.Mountain);
        location.setColumn(8);
        location.setRow(4);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Mountain");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[5][8] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(8);
        location.setRow(5);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[6][8] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(8);
        location.setRow(6);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[7][8] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(8);
        location.setRow(7);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[8][8] = location;
        location.setBackgroundType(BackgroundType.Beach);
        location.setColumn(8);
        location.setRow(8);
        location.setBlocked(false);
        location.setComplete(false);
        location.setVisited(false);
        location.setDescription("Beach");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        locations[9][8] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(8);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        // line 9
        
        locations[0][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(0);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[1][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(1);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[2][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(2);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[3][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(3);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[4][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(4);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[5][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(5);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);

        location = new Location();
        locations[6][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(6);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[7][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(7);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[8][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(8);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);
        
        location = new Location();
        locations[9][9] = location;
        location.setBackgroundType(BackgroundType.Ocean);
        location.setColumn(9);
        location.setRow(9);
        location.setBlocked(true);
        location.setComplete(true);
        location.setVisited(false);
        location.setDescription("Ocean");
        location.setActor(null);
        location.setRiddle(null);
        location.setItemRequired(null);
        location.setObtainItem(null);
        location.setTalkToNPC(null);;
        if (location == null) {
            return null;
        }

        return locations;
    }



    public static void assignActorsToLocations(Location[][] hank)
            throws MapControlException {
        System.out.println(" *** assignActorsToLocations called ***");

        if (hank == null) {
            System.out.println("hank is null");
        }

    }

    public static void assignItemsToLocations(Location[][] locations)
            throws MapControlException {
        System.out.println(" *** assignItemToLocations called ***");

        if (locations == null) {
            System.out.println("locations is null");
        }

    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        MapControl.map = map;
    }

    public static Location moveActor(Actor actor, int newRow, int newColumn) throws MapControlException {

        if (actor == null) {
            throw new MapControlException("Invalid actor");
        }

        Game currentGame = EscapeIsland.getCurrentGame();
        Map map = currentGame.getMap();
        Location[][] locations = map.getLocations();

        if (newRow < 0 || newRow > (map.getRowCount() - 1) || newColumn < 0 || newColumn > (map.getColumnCount() - 1)) {
            System.out.println(newRow);
            System.out.println(newColumn);
            throw new MapControlException("Out of bounds");
        }

        Point currentCoordinates = actor.getActorcoordinates();
        Location oldLocation = locations[currentCoordinates.x][currentCoordinates.y];
        Location newLocation = locations[newRow][newColumn];
        if (newLocation.isBlocked()) {
            throw new MapControlException("location is blocked");
        }

        oldLocation.setActor(null);
        newLocation.setActor(actor);
        currentCoordinates.x = newRow;
        currentCoordinates.y = newColumn;

        return newLocation;
    }
}
