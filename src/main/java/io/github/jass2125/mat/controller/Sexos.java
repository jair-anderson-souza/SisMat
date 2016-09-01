/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Anderson Souza
 */
@Named
@ApplicationScoped
public class Sexos {
    private String MASCUINO;
    private String FEMININO;
    private String OUTRO;

    public String getMASCUINO() {
        return MASCUINO;
    }

    public void setMASCUINO(String MASCUINO) {
        this.MASCUINO = MASCUINO;
    }

    public String getFEMININO() {
        return FEMININO;
    }

    public void setFEMININO(String FEMININO) {
        this.FEMININO = FEMININO;
    }

    public String getOUTRO() {
        return OUTRO;
    }

    public void setOUTRO(String OUTRO) {
        this.OUTRO = OUTRO;
    }

}
