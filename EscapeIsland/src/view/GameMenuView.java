package view;

import model.Player;
import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class GameMenuView {
 
    public void displayGameMenuView(){
        
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
                if (inputs[0].trim().length() < 1){
                    System.out.println("Invald Option.");
                    continue;
                }
                endOfView = doAction(inputs);
        } while (endOfView != true);
    }
    
    private String[] getInputs() {
      
        String[] inputs = new String[1];

            System.out.println("***********************************************************"
                           + "\n***********************************************************"
                           + "\n*                                                         *"
                           + "\n* W - Move North                                          *"
                           + "\n* A - Move West                                           *"
                           + "\n* S - Move South                                          *"
                           + "\n* D - Move East                                           *"
                           + "\n* M - Map                                                 *"
                           + "\n* I - Inventory                                           *"
                           + "\n* E - Interact With Enviroment                            *"
                           + "\n* Q - Quit to Main Menu                                   *"
                           + "\n*                                                         *"
                           + "\n***********************************************************"
                           + "\n***********************************************************");

                    String[] menuItem = new String[1];
                    Scanner sc = new Scanner(System.in);
                    menuItem[0] = sc.nextLine();  

                return menuItem;
            }
 
    private boolean doAction(String[] inputs) {

        char c = inputs[0].trim().toUpperCase().charAt(0);
        switch(c){
            case 'W':
                moveNorth();
                break;
            case 'A':
                moveEast();
                break;
            case 'S':
                moveSouth();
                break;
            case 'D':
                moveWest();
                break;
            case 'M':
                openMap();
                break;
            case 'I':
                openInventory();
                break;
            case 'E':
                interactWithEnviroment();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Option.");
        }
        
        return false;    
    }

    private void moveNorth() {
         
    }

    private void moveEast() {
        
    }

    private void moveSouth() {
        
    }

    private void moveWest() {
    
    }

    private void openMap() {
        
    }

    private void openInventory() {
        
    }

    private void interactWithEnviroment() {
        
    }
   
    public static class player{
        int positionX;
        int positionY;

        public player(int positionX, int positionY) {
            this.positionX = positionX;
            this.positionY = positionY;
        }

        public int getPositionX() {
            return positionX;
        }

        public int getPositionY() {
            return positionY;
        }

        public void setPositionX(int positionX) {
            this.positionX = positionX;
        }

        public void setPositionY(int positionY) {
            this.positionY = positionY;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + this.positionX;
            hash = 97 * hash + this.positionY;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final player other = (player) obj;
            if (this.positionX != other.positionX) {
                return false;
            }
            if (this.positionY != other.positionY) {
                return false;
            }
            return true;
        }        
    }
    
    public void displayMap() {
        MapView map = new MapView();
        map.displayMapView();
}
}
