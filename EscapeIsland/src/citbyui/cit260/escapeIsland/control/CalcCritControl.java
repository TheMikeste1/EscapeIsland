/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeIsland.control;

/**
 *
 * @author collin
 */
public class CalcCritControl {
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