/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeIsland.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Austin
 */
public class calcTurnOrderControlTest {
    
    public calcTurnOrderControlTest() {
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
        double result = calcTurnOrderControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        /* fail("The test case is a prototype."); */
        
        System.out.println("Test case 2");
        
        actorEnemySpeed = -1;
        actorPlayerSpeed = 4;
        actorItem = 2.0;
        expResult = -1;
        result = calcTurnOrderControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
        
        System.out.println("Test case 2");
        
        actorEnemySpeed = -1;
        actorPlayerSpeed = 4;
        actorItem = 2.0;
        expResult = -1;
        result = calcTurnOrderControl.calcSpeed(actorEnemySpeed, actorPlayerSpeed, actorItem);
        assertEquals(expResult, result, 0.00);
   
    
    
    
    
    
    
    
    }
    
}
