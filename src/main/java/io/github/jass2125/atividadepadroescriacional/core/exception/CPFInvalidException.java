/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.exception;

/**
 *
 * @author Anderson Souza
 */
public class CPFInvalidException extends Exception {

    public CPFInvalidException(String message) {
        super(message);
    }

    public CPFInvalidException() {
    }

    public CPFInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public CPFInvalidException(Throwable cause) {
        super(cause);
    }

}
