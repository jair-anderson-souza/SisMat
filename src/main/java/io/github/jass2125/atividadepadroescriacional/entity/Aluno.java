/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.entity;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Anderson Souza
 */
@Entity
public class Aluno extends Pessoa implements Serializable {

    private String numeroDocumentoMilitar;

    public Aluno() {
    }

    public String getNumeroDocumentoMilitar() {
        return numeroDocumentoMilitar;
    }

    public void setNumeroDocumentoMilitar(String numeroDocumentoMilitar) {
        this.numeroDocumentoMilitar = numeroDocumentoMilitar;
    }

}
