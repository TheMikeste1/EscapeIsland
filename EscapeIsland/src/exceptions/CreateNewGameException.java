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
public class CreateNewGameException extends Exception {

    public CreateNewGameException() {
    }

    public CreateNewGameException(String message) {
        super(message);
    }

    public CreateNewGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateNewGameException(Throwable cause) {
        super(cause);
    }

    public CreateNewGameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
