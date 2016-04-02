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
public class NomeInvalidoException extends Exception {

    public NomeInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public NomeInvalidoException(Throwable cause) {
        super(cause);
    }

    public NomeInvalidoException(String message) {
        super(message);
    }

    public NomeInvalidoException() {
    }

}
