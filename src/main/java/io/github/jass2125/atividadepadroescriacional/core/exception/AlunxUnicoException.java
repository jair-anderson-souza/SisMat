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
public class AlunxUnicoException extends Exception {

    public AlunxUnicoException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlunxUnicoException(Throwable cause) {
        super(cause);
    }

    public AlunxUnicoException(String message) {
        super(message);
    }

}
