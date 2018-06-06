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
public class CalcDamageDealtControlTest {
    
    public CalcDamageDealtControlTest() {
    }

    /**
     * Test of calcDamageDealt method, of class calcDamageDealtControl.
     */
    @Test
    public void testCalcDamageDealt() {
        System.out.println("calcDamageDealt");
        
        System.out.println("Test case 1");
        
        double actorPlayerStrength = 5.0;
        double actorWeapon = 3.0;
        double actorEnemyDefense = 3.0;
        double expResult = 5.0;
        double result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test case 2");
        
        actorPlayerStrength     = -1.0;
        actorWeapon             = 3.0;
        actorEnemyDefense       = 3.0;
        expResult               = -1.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 3");
        
        actorPlayerStrength     = 101.0;
        actorWeapon             = 3.0;
        actorEnemyDefense       = 3.0;
        expResult               = -1.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 4");
        
        actorPlayerStrength     = 5.0;
        actorWeapon             = -1.0;
        actorEnemyDefense       = 3.0;
        expResult               = -1.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 5");
        
        actorPlayerStrength     = 5.0;
        actorWeapon             = 101.0;
        actorEnemyDefense       = 3.0;
        expResult               = -1.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 6");
        
        actorPlayerStrength     = 5.0;
        actorWeapon             = 3.0;
        actorEnemyDefense       = -1.0;
        expResult               = -1.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 7");
        
        actorPlayerStrength     = 5.0;
        actorWeapon             = 3.0;
        actorEnemyDefense       = 101.0;
        expResult               = -1.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 8");
        
        actorPlayerStrength     = 1.0;
        actorWeapon             = 1.0;
        actorEnemyDefense       = 1.0;
        expResult               = 1.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 9");
        
        actorPlayerStrength     = 1.0;
        actorWeapon             = 1.0;
        actorEnemyDefense       = 100.0;
        expResult               = -98.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 10");
        
        actorPlayerStrength     = 1.0;
        actorWeapon             = 100.0;
        actorEnemyDefense       = 100.0;
        expResult               = 1.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 11");
        
        actorPlayerStrength     = 100.0;
        actorWeapon             = 100.0;
        actorEnemyDefense       = 100.0;
        expResult               = 100.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 12");
        
        actorPlayerStrength     = 100.0;
        actorWeapon             = 100.0;
        actorEnemyDefense       = 1.0;
        expResult               = 199.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test case 13");
        
        actorPlayerStrength     = 100.0;
        actorWeapon             = 1.0;
        actorEnemyDefense       = 1.0;
        expResult               = 100.0;
        result = CalcDamageDealtControl.calcDamageDealt(actorPlayerStrength, actorWeapon, actorEnemyDefense);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
