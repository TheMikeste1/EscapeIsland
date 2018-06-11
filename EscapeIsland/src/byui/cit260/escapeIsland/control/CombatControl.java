/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeIsland.control;

/**
 *
 * @author collin
 */
public class CombatControl {
     
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
     


    public static double calcCrit (double aa, double as, double ais, double aia, double chance) {

	if (aa < 0 || as < 0 || ais < 0 || aia <0) {
		return -1;
    }
	if (aa > 100 || as > 100 || ais > 100 || aia > 100) {
		return -1;
    }

    double criticalHitChance = (aa + as + ais + aia) / 100;

   
        System.out.println(criticalHitChance);
        System.out.println(chance);
        //System.out.println(derp);
if (criticalHitChance > chance) {
	return aa*2;
}
else {
    return 0;
} 

    }   
}