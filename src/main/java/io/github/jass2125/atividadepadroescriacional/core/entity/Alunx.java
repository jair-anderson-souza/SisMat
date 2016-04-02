/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.entity;

import io.github.jass2125.atividadepadroescriacional.core.util.NacionalidadeEnum;
import io.github.jass2125.atividadepadroescriacional.core.util.SexoEnum;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Anderson Souza
 */
public class Alunx implements Serializable {

    private String nome;
    private SexoEnum sexo;
    private Date dtNasc;
    private NacionalidadeEnum nacionalidade;
    private String identidade;
    private String CPF;
    private String numeroDocumentoMilitar;

    public Alunx() {
    }

    public Alunx(String nome, SexoEnum sexo, Date dtNasc,
            NacionalidadeEnum nacionalidade, String identidade, String CPF, String numeroDocumentoMilitar) {
        this.nome = nome;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
        this.nacionalidade = nacionalidade;
        this.identidade = identidade;
        this.CPF = CPF;
        this.numeroDocumentoMilitar = numeroDocumentoMilitar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public NacionalidadeEnum getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalidadeEnum nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNumeroDocumentoMilitar() {
        return numeroDocumentoMilitar;
    }

    @Override
    public String toString() {
        return "Aluno{nome= " + nome + ", sexo=" + sexo + ", dtNasc=" + dtNasc + ", nacionalidade=" + nacionalidade + ", identidade=" + identidade + ", CPF=" + CPF + ", numeroDocumentoMilitar=" + numeroDocumentoMilitar + '}';
    }

    public void setNumeroDocumentoMilitar(String numeroDocumentoMilitar) {
        this.numeroDocumentoMilitar = numeroDocumentoMilitar;
    }

}
