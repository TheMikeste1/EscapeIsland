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
 * @author collin
 */
public class CalcCritControlTest {
    
    public CalcCritControlTest () {
        
    }
@Test
    public void testCalcCrit() {
    System.out.println("CalcCrit");
        
    System.out.println("Test case 1");
        
    double actorAttack = 1.0;
    double actorSpeed = 1.0;
    double actorItemAttack = 1.0;
    double actorItemSpeed = 1.0;
    double expResult = 2.0;
    double chance = 0.01;
    double result;
        result = CombatControl.calcCrit(actorAttack, actorSpeed, actorItemAttack, actorItemSpeed, chance);
    assertEquals(expResult, result, 0.0);
    
    
    System.out.println("CalcCrit Test");
        
    System.out.println("Test case 2");
    
    actorAttack = -1.0;
    actorSpeed = 1.0;
    actorItemAttack = 1.0;
    actorItemSpeed = 1.0;
    expResult = -1;
    result = CombatControl.calcCrit(actorAttack, actorSpeed, actorItemAttack, actorItemSpeed, chance);
    assertEquals(expResult, result, 0.0);
    
    
    System.out.println("CalcCrit Test");
        
    System.out.println("Test case 3");
    
    actorAttack = 1.0;
    actorSpeed = -1.0;
    actorItemAttack = 1.0;
    actorItemSpeed = 1.0;
    expResult = -1.0;
    result = CombatControl.calcCrit(actorAttack, actorSpeed, actorItemAttack, actorItemSpeed, chance);
    assertEquals(expResult, result, 0.0);
    
    
        
    System.out.println("CalcCrit Test");
        
    System.out.println("Test case 4");
    
    actorAttack = 1.0;
    actorSpeed = 1.0;
    actorItemAttack = -1.0;
    actorItemSpeed = 1.0;
    expResult = -1.0;
    result = CombatControl.calcCrit(actorAttack, actorSpeed, actorItemAttack, actorItemSpeed, chance);
    assertEquals(expResult, result, 0.0);
    
    
       
    System.out.println("CalcCrit Test");
        
    System.out.println("Test case 5");
    
    actorAttack = 99.0;
    actorSpeed = 1.0;
    actorItemAttack = 1.0;
    actorItemSpeed = 1.0;
    expResult = 198.0;
    result = CombatControl.calcCrit(actorAttack, actorSpeed, actorItemAttack, actorItemSpeed, chance);
    assertEquals(expResult, result, 0.0);
    
        
    System.out.println("CalcCrit Test");
        
    System.out.println("Test case 6");
    
    actorAttack = 1.0;
    actorSpeed = 99.0;
    actorItemAttack = 1.0;
    actorItemSpeed = 1.0;
    expResult = 2.0;
    result = CombatControl.calcCrit(actorAttack, actorSpeed, actorItemAttack, actorItemSpeed, chance);
    assertEquals(expResult, result, 0.0);
    
        
    System.out.println("CalcCrit Test");
        
    System.out.println("Test case 7");
    
    actorAttack = 1.0;
    actorSpeed = 1.0;
    actorItemAttack = 1.0;
    actorItemSpeed = 0.0;
    expResult = 2.0;
    result = CombatControl.calcCrit(actorAttack, actorSpeed, actorItemAttack, actorItemSpeed, chance);
    assertEquals(expResult, result, 0.0);
    
    }
    
    
       
}