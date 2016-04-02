/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.util;

/**
 *
 * @author Anderson Souza
 */
public enum SexoEnum {

    MASCULINO("Masculino"), FEMININO("Feminino");

    private String sexo;

    private SexoEnum(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public static SexoEnum getMASCULINO() {
        return MASCULINO;
    }

    public static SexoEnum getFEMININO() {
        return FEMININO;
    }

}
