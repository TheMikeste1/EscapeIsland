/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlTest;

import control.CombatControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Austin
 */
public class CalcTurnOrderControlTest {
    
    public CalcTurnOrderControlTest() {
    }

    /**
     * Test of calcSpeed method, of class calcTurnOrderControl.
     */
    @Test
    public void testCalcSpeed() {
        System.out.println("testing calcSpeed");
        
        System.out.println("Test case 1");
        
        double actorEnemySpeed = 4.0;
        double actorPlayerSpeed = 6.0;
        double actorItem = 2.0;
        double expResult = 2.0;
        double result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        /* fail("The test case is a prototype."); */
        
        System.out.println("Test case 2");
        
        actorEnemySpeed = -1;
        actorPlayerSpeed = 4;
        actorItem = 2.0;
        expResult = -1;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
        
        System.out.println("Test case 3");
        
        actorEnemySpeed = 4;
        actorPlayerSpeed = 101;
        actorItem = 2.0;
        expResult = -1;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
        
                
        System.out.println("Test case 4");
        
        actorEnemySpeed = -1;
        actorPlayerSpeed = 6;
        actorItem = 2.0;
        expResult = -1;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
   
    
    
         
        System.out.println("Test case 5");
        
        actorEnemySpeed = 101;
        actorPlayerSpeed = 6;
        actorItem = 2.0;
        expResult = -1;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
    
    
            
        System.out.println("Test case 6");
        
        actorEnemySpeed = 4;
        actorPlayerSpeed = 6;
        actorItem = -1.0;
        expResult = -1;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
    
        
        
               
        System.out.println("Test case 7");
        
        actorEnemySpeed = 4;
        actorPlayerSpeed = 6;
        actorItem = 101.0;
        expResult = -1;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
        
        System.out.println("Test case 8");
        
        actorEnemySpeed = 1;
        actorPlayerSpeed = 1;
        actorItem = 1.0;
        expResult = 2;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
        
                
        System.out.println("Test case 9");
        
        actorEnemySpeed = 1;
        actorPlayerSpeed = 1;
        actorItem = 100.0;
        expResult = 101;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
   
    
    
         
        System.out.println("Test case 10");
        
        actorEnemySpeed = 100;
        actorPlayerSpeed = 1;
        actorItem = 100.0;
        expResult = 1.01;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
    
    
            
        System.out.println("Test case 11");
        
        actorEnemySpeed = 100;
        actorPlayerSpeed = 100;
        actorItem = 100;
        expResult = 2;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
        
        
               
        System.out.println("Test case 12");
        
        actorEnemySpeed = 100;
        actorPlayerSpeed = 100;
        actorItem = 1.0;
        expResult = 1.01;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
   
    
    
         
        System.out.println("Test case 13");
        
        actorEnemySpeed = 1;
        actorPlayerSpeed = 100;
        actorItem = 1.0;
        expResult = 101;
        result = CombatControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
    
    
            

    }
    
}
