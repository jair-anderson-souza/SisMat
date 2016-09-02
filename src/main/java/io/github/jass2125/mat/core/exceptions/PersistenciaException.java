/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.core.exceptions;

/**
 *
 * @author Anderson Souza
 */
public class PersistenciaException extends Exception {

    public PersistenciaException(Exception e, String msg) {
        super(msg, e);
    }

}
