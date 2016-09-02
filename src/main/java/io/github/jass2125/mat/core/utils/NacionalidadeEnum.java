/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.mat.core.utils;

/**
 *
 * @author Anderson Souza
 */
public enum NacionalidadeEnum {
    ARG("Argentina"), PER("Peru"), BRA("Brasil"), 
    COL("Colombia"), VEN("Venezuela"), CHI("Chile"), 
    EQU("Equador"), BOL("Bolivia"), URU("Uruguai"), 
    PAR("Paraguai"), SUR("Suriname"), GUI("Guiana");
    
    private String nacionalidade;

    private NacionalidadeEnum(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    
    

}
