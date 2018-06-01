/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeIsland.control;

/**
 *
 * @author Austin
 */
public class calcTurnOrderControl {
    
 
    public static double calcSpeed(double actorEnemySpeed, double actorPlayerSpeed, double actorItem) {


     if (actorEnemySpeed < 1) {
          return -1;
     }
     
     if (actorEnemySpeed < 1 || actorEnemySpeed > 100){
         return -1;
     }
     
     if (actorPlayerSpeed < 1){
          return -1;
     }
     
     if(actorPlayerSpeed < 1 || actorPlayerSpeed > 100){
         return -1;
    }
     
     if(actorItem < 1){
          return -1;
     }
     
     if(actorItem < 1 || actorItem > 100){
         return -1;
    }
     
        double playerSpeed = actorItem + actorPlayerSpeed;
        double fightSpeed = playerSpeed / actorEnemySpeed;
       
        return fightSpeed;
        

        
        }
}
