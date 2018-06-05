package citbyui.cit260.escapeIsland.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
public class calcDamageDealtControl {
    
    public static double calcDamageDealt(double actorPlayerStrength, double actorWeapon, double actorEnemyDefense) {
        
        if (actorPlayerStrength < 1) {
            return -1;
        }	
        
        if (actorPlayerStrength < 1 || actorPlayerStrength > 100){
            return -1;
        }
        
        if (actorWeapon < 1){
            return -1;
        }
        
        if (actorWeapon < 1 || actorWeapon > 100){
            return -1;
        }
        
        if (actorEnemyDefense < 1){
            return -1;
        }
        
        if (actorEnemyDefense < 1 || actorEnemyDefense > 100){
            return -1;
        }
        
        double playerDamageDealt = actorPlayerStrength + actorWeapon;
        double damageDealt = playerDamageDealt - actorEnemyDefense;
        
        return damageDealt;
  
    }
    
}
