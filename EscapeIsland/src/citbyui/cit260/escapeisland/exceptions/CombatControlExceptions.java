/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeisland.exceptions;

/**
 *
 * @author Austin
 */
public class CombatControlExceptions extends Exception {

    public CombatControlExceptions() {
    }

    public CombatControlExceptions(String message) {
        super(message);
    }

    public CombatControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public CombatControlExceptions(Throwable cause) {
        super(cause);
    }

    public CombatControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
