/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author collin
 */
public class CombatControlException extends Exception{

    public CombatControlException() {
    }

    public CombatControlException(String message) {
        super(message);
    }

    public CombatControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CombatControlException(Throwable cause) {
        super(cause);
    }

    public CombatControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
