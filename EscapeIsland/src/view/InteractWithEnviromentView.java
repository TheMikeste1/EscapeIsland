package view;

import control.GameControl;
import escapeIsland.EscapeIsland;
import java.util.Scanner;
import model.*;

/**
 *
 * @author Austin
 */
public class InteractWithEnviromentView extends View {

    Actor max = Actor.MonsterZombie;


    public boolean doAction(String[] inputs) {

        char interactionsMenu = inputs[0].trim().toUpperCase().charAt(0);

        switch (interactionsMenu) {
            case 'C':
                combatControls();
                break;
            case 'I':
                itemRequiredScene();
                break;
            case 'L':
                getLoot();
                break;
            case 'T':
                talkToNPC();
                break;
            case 'P':
                puzzle();
                break;
            case 'R':
                riddle(EscapeIsland.getCurrentGame(). //Access the map
  /*...at location:*/  getMap().getLocations()[(int) Actor.Hero.getActorcoordinates().getY()] //CoordY
                        [(int) Actor.Hero.getActorcoordinates().getX()] // CoordX
                        .getRiddle());
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Option");
        }

        return false;
    }

    public String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println("***********************************************************"
                + "\n***********************************************************"
                + "\n*                                                         *"
                + "\n* Interactions                                            *"
                + "\n*                                                         *"
                + "\n* C - Combat                                              *"
                + "\n* I - Item Required                                       *"
                + "\n* L - Loot                                                *"
                + "\n* T - Talk                                                *"
                + "\n* P - Puzzle                                              *"
                + "\n* R - Riddle                                              *"
                + "\n* Q - Quit to Game Menu                                   *"
                + "\n*                                                         *"
                + "\n***********************************************************"
                + "\n***********************************************************");

        String[] menuItem = new String[1];
        Scanner sc = new Scanner(System.in);
        menuItem[0] = sc.nextLine();

        return menuItem;
    }

    private void combatControls() {
        System.out.println("\n***********************************************************"
                + "\n***********************************************************"
                + "\n*                                                         *"
                + "\n* Combat                                                  *"
                + "\n*                                                         *"
                + "\n*A - Attack                                               *"
                + "\n*D - Defend                                               *"
                + "\n*I - Item                                                 *"
                + "\n*F - Flee                                                 *"
                + "\n*                                                         *"
                + "\n***********************************************************"
                + "\n***********************************************************");
        return;
    }

    private void itemRequiredScene() {
        if (max.getCurrentItem() != Item.ToolKit) {
            System.out.println("\n***********************************************************"
                    + "\n***********************************************************"
                    + "\n*                                                         *"
                    + "\n*The " + Item.ToolKit.getItemName() + "                   *"
                    + "\n*is required to progress                                  *"
                    + "\n                                                          *"
                    + "\n***********************************************************"
                    + "\n***********************************************************");
            return;
        } else {
            System.out.println("\n***********************************************************"
                    + "\n***********************************************************"
                    + "\n*                                                         *"
                    + "\n*The " + Item.ToolKit.getItemName() + "                   *"
                    + "\n* allowed you to progress.                                *"
                    + "\n*                                                         *"
                    + "\n***********************************************************"
                    + "\n***********************************************************");
        }
    }

    private void getLoot() {
        System.out.println("\n***********************************************************"
                + "\n***********************************************************"
                + "\n*                                                         *"
                + "\n*Congradulations you have obtained " + Item.Sword.getItemName() + "        *"
                + "\n*                                                         *"
                + "\n***********************************************************"
                + "\n***********************************************************");
        return;
    }

    private boolean talkToNPC() {
        boolean javaIsDumb = true;
        while (javaIsDumb) {
            System.out.println("A - Hello");
            System.out.println("B - How are you");
            System.out.println("C - Thats good");
            System.out.println("D - Good bye");

            Scanner sc = new Scanner(System.in);
            String talkToNPC = sc.nextLine();

            char chatOptions = talkToNPC.trim().toUpperCase().charAt(0);

            switch (chatOptions) {

                case 'A':
                    optionAChat();
                    break;

                case 'B':
                    optionBChat();
                    break;

                case 'C':
                    optionCChat();
                    break;

                case 'D':
                    optionDChat();
                    return true;

                case 'Q':
                    return true;

                default:
                    System.out.println("Invalid Option");

            }
        }
        return false;
    }

    private void puzzle() {
        System.out.println("\n***********************************************************"
                + "\n***********************************************************"
                + "\n*                                                         *"
                + "\n*                                                         *"
                + "\n*Puzzle Text                                              *"
                + "\n*                                                         *"
                + "\n*                                                         *"
                + "\n*                                                         *"
                + "\n***********************************************************"
                + "\n***********************************************************");
        return;
    }

    private void riddle(Riddle riddle) {
        System.out.println("\n***********************************************************"
                + "\n***********************************************************"
                + "\n*                                                         *"
                + "\n*                                                         *"
                + riddle 
                + "\n*                                                         *"
                + "\n*                                                         *"
                + "\n***********************************************************"
                + "\n***********************************************************");
        
        Scanner riddleScanner = new Scanner(System.in);
        String rScanner = riddleScanner.nextLine();
        
        if( rScanner == riddle.getAnswer()){
            System.out.println("Correct!");
            riddle.setRiddleDone(true);
        } else {
            System.out.println("Incorrect, try agian.");
        }
        return;
    }

    private void optionAChat() {
        System.out.println("Hello");
        System.out.println("NPC says \"hello\"");

    }

    private void optionBChat() {
        System.out.println("How are you");
        System.out.println("NPC says \"Good\"");

    }

    private void optionCChat() {
        System.out.println("Thats good");
        System.out.println("NPC says \"Yup\"");
    }

    private void optionDChat() {
        System.out.println("Good bye");
        System.out.println("NPC says \"Bye!\"");

    }
}
