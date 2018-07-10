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
public class MapControlExteption extends Exception {

    public MapControlExteption() {
    }

    public MapControlExteption(String message) {
        super(message);
    }

    public MapControlExteption(String message, Throwable cause) {
        super(message, cause);
    }

    public MapControlExteption(Throwable cause) {
        super(cause);
    }

    public MapControlExteption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
