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
public class CPFInvalidoException extends Exception {

    public CPFInvalidoException(String message) {
        super(message);
    }

    public CPFInvalidoException() {
    }

    public CPFInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CPFInvalidoException(Throwable cause) {
        super(cause);
    }

}
